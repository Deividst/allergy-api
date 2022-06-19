package com.text.mining.allergyapi.repository;

import com.text.mining.allergyapi.model.Results;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultsRepository extends JpaRepository<Results, Long> {
}
