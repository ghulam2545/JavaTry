package com.ghulam.repository;

import com.ghulam.model.AtmCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<AtmCard, String> {
    // probably more code here ..
}
