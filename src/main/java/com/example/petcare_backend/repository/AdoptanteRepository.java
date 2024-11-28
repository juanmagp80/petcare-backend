package com.example.petcare_backend.repository;

import com.example.petcare_backend.model.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdoptanteRepository extends JpaRepository<Adoptante, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
