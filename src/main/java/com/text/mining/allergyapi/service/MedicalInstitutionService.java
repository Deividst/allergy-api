package com.text.mining.allergyapi.service;

import com.text.mining.allergyapi.model.MedicalInstitution;
import com.text.mining.allergyapi.repository.MedicalInstitutionRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class MedicalInstitutionService {

    private final MedicalInstitutionRepository repository;

    public MedicalInstitutionService(MedicalInstitutionRepository repository) {
        this.repository = repository;
    }

    public MedicalInstitution findInstitutionByUserName(String userName) {
        MedicalInstitution result = this.repository.findByUserName(userName);

        if (result == null) {
            throw new EntityNotFoundException("Nenhum registro encontrato com o user name informado.");
        }

        return result;
    }
}
