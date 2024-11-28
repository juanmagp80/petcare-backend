package com.example.petcare_backend.repository;

import com.example.petcare_backend.model.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdopcionRepository extends JpaRepository<Adopcion, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
