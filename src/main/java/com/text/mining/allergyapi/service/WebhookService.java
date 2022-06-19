package com.text.mining.allergyapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.text.mining.allergyapi.model.MedicalInstitution;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Log4j
@Service
public class WebhookService {

    public void sendDataToMedicalInstitution(MedicalInstitution institution, String json) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth(institution.getWebhook().getUserName(),institution.getWebhook().getPassword());

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<>(json, headers);

        ResponseEntity<String> responseEntityStr = restTemplate.postForEntity(institution.getWebhook().getUrl(), request, String.class);

        log.info("Response status: " + responseEntityStr.getStatusCode());
    }

}
