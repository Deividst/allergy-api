package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.dto.MessageQueueDto;
import com.text.mining.allergyapi.dto.WordDto;
import com.text.mining.allergyapi.enums.WordType;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.InternationalPatientSummaryComposition;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.definition.*;
import com.text.mining.allergyapi.util.EHRUtils;
import com.text.mining.allergyapi.util.LogUtils;
import lombok.extern.log4j.Log4j;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j
@Service
public class ConverterService {

    private String allergy;
    private List<String> symptoms;

    private final WebhookService webhookService;

    public ConverterService(WebhookService webhookService) {
        this.webhookService = webhookService;
    }

    public void process(MessageQueueDto messageQueueDto) {
        this.symptoms = new ArrayList<>();
        try {
            for (WordDto word : messageQueueDto.getWords()) {
                if (word.getType().equals(WordType.ALLERGY)) {
                    this.allergy = word.getWordtext();
                }

                if (word.getType().equals(WordType.SYMPTOM)) {
                    this.symptoms.add(word.getWordtext());
                }
            }

            String json = EHRUtils.templateToFlatJson(buildInternationalPatientSummaryComposition());
            System.out.println(json);

            webhookService.sendDataToMedicalInstitution(messageQueueDto.getDataDto().getInstitution(), json);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            log.info("ConverterService.process() | Final Time: " + LogUtils.logExecutionTime());
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

        composition.getAllergyIntolerance().setCommentValue(this.allergy);

        composition.getAllergyIntolerance().setReaction(new ArrayList<>());
        symptoms.forEach(symptom -> {
            AllergyIntoleranceReactionCluster allergyIntoleranceReactionCluster = new AllergyIntoleranceReactionCluster();
            allergyIntoleranceReactionCluster.setManifestation(new ArrayList<>());

            AllergyIntoleranceManifestationElement allergyIntoleranceManifestationElement = new AllergyIntoleranceManifestationElement();
            allergyIntoleranceManifestationElement.setValue(symptom);
            allergyIntoleranceReactionCluster.getManifestation().add(allergyIntoleranceManifestationElement);
            composition.getAllergyIntolerance().getReaction().add(allergyIntoleranceReactionCluster);
        });

        return composition;
    }

}
