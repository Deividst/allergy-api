package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.dto.WordDto;
import com.text.mining.allergyapi.enums.WordType;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.InternationalPatientSummaryComposition;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.definition.*;
import com.text.mining.allergyapi.util.EHRUtils;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang.time.StopWatch;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Log4j
@Service
public class ConverterService {

    private String substance;
    private String allergy;
    private final List<String> symptoms = new ArrayList<>();

    public void process(MessageQueueDto messageQueueDto) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            for (WordDto word : messageQueueDto.getWords()) {
                if (word.getType().equals(WordType.SUBSTANCE)) {
                    this.substance = word.getWordtext();
                }

                if (word.getType().equals(WordType.ALLERGY)) {
                    this.allergy = word.getWordtext();
                }

                if (word.getType().equals(WordType.SYMPTOM)) {
                    this.symptoms.add(word.getWordtext());
                }
            }

            String json = EHRUtils.templateToFlatJson(buildInternationalPatientSummaryComposition());
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            log.info("ConverterService.process() | Final Time: " + stopWatch.getTime());
        }
    }

    private InternationalPatientSummaryComposition buildInternationalPatientSummaryComposition() {
        InternationalPatientSummaryComposition composition = new InternationalPatientSummaryComposition();
        composition.setLanguage(Language.EN_US);
        composition.setAllergyIntolerance(new AllergyIntoleranceEvaluation());
        composition.getAllergyIntolerance().setTypeValue("Allergy");

        AllergyIntoleranceVerificationStatusDvCodedText status = new AllergyIntoleranceVerificationStatusDvCodedText();
        status.setVerificationStatusDefiningCode(VerificationStatusDefiningCode.CONFIRMED);
        composition.getAllergyIntolerance().setVerificationStatus(status);

        composition.getAllergyIntolerance().setSubstanceValue(this.substance);
        composition.getAllergyIntolerance().setCommentValue(this.allergy);

        AllergyIntoleranceReactionCluster allergyIntoleranceReactionCluster = new AllergyIntoleranceReactionCluster();
        allergyIntoleranceReactionCluster.setManifestation(new ArrayList<>());

        symptoms.forEach(symptom -> {
            AllergyIntoleranceManifestationElement allergyIntoleranceManifestationElement = new AllergyIntoleranceManifestationElement();
            allergyIntoleranceManifestationElement.setValue(symptom);
            allergyIntoleranceReactionCluster.getManifestation().add(allergyIntoleranceManifestationElement);
        });

        composition.getAllergyIntolerance().setReaction(Collections.singletonList(allergyIntoleranceReactionCluster));
        return composition;
    }

}
