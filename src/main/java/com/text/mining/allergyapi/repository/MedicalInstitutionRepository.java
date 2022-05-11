package com.text.mining.allergyapi.repository;

import com.text.mining.allergyapi.model.MedicalInstitution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalInstitutionRepository extends JpaRepository<MedicalInstitution, Long> {

    MedicalInstitution findByUserName(String userName);

}
