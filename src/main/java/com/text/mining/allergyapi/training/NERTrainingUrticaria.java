package com.text.mining.allergyapi.training;

import opennlp.tools.namefind.*;
import opennlp.tools.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;


public class NERTrainingUrticaria {

    public static void main(String[] args) {

        InputStreamFactory in = null;
        try {
            in = new MarkableFileInputStreamFactory(new File("src/main/resources/allergy_urticaria_dictionary.txt"));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }

        ObjectStream<NameSample> sampleStream = null;
        try {
            sampleStream = new NameSampleDataStream(
                    new PlainTextByLineStream(in, StandardCharsets.UTF_8));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // setting the parameters for training
        TrainingParameters params = new TrainingParameters();
        params.put(TrainingParameters.ITERATIONS_PARAM, 70);
        params.put(TrainingParameters.CUTOFF_PARAM, 1);

        // training the model using TokenNameFinderModel class
        TokenNameFinderModel nameFinderModel = null;
        try {
            nameFinderModel = NameFinderME.train("en", null, sampleStream,
                    params, TokenNameFinderFactory.create(null, null, Collections.emptyMap(), new BioCodec()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // saving the model to "ner-custom-allergy-model" file
        try {
            File output = new File("src/main/resources/ner-custom-allergy-urticaria-model.bin");
            FileOutputStream outputStream = new FileOutputStream(output);
            nameFinderModel.serialize(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
