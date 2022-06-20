package com.text.mining.allergyapi.training;

import opennlp.tools.namefind.*;
import opennlp.tools.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;


public class NERTrainingRhinitis {

    public static void main(String[] args) {

        try {
            InputStreamFactory in = new MarkableFileInputStreamFactory(new File("src/main/resources/allergy_rhinitis_dictionary.txt"));

            ObjectStream<NameSample> sampleStream = new NameSampleDataStream(new PlainTextByLineStream(in, StandardCharsets.UTF_8));

            TrainingParameters params = new TrainingParameters();
            params.put(TrainingParameters.ITERATIONS_PARAM, 70);
            params.put(TrainingParameters.CUTOFF_PARAM, 1);

            TokenNameFinderModel nameFinderModel = NameFinderME.train("en", null, sampleStream, params,
                    TokenNameFinderFactory.create(null, null, Collections.emptyMap(), new BioCodec()));

            File output = new File("src/main/resources/ner-custom-allergy-rhinitis-model.bin");
            FileOutputStream outputStream = new FileOutputStream(output);
            nameFinderModel.serialize(outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
