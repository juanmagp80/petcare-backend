package com.example.petcare_backend.repository;

import com.example.petcare_backend.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
