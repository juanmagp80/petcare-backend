package com.example.petcare_backend.service;

import com.example.petcare_backend.model.Adopcion;
import com.example.petcare_backend.repository.AdopcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdopcionService {

    @Autowired
    private AdopcionRepository adopcionRepository;

    public List<Adopcion> getAllAdopciones() {
        return adopcionRepository.findAll();
    }

    public Optional<Adopcion> getAdopcionById(Long id) {
        return adopcionRepository.findById(id);
    }

    public Adopcion saveAdopcion(Adopcion adopcion) {
        return adopcionRepository.save(adopcion);
    }

    public void deleteAdopcion(Long id) {
        adopcionRepository.deleteById(id);
    }
}
