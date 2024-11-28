package com.example.petcare_backend.service;

import com.example.petcare_backend.model.Adoptante;
import com.example.petcare_backend.repository.AdoptanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdoptanteService {

    @Autowired
    private AdoptanteRepository adoptanteRepository;

    public List<Adoptante> getAllAdoptantes() {
        return adoptanteRepository.findAll();
    }

    public Optional<Adoptante> getAdoptanteById(Long id) {
        return adoptanteRepository.findById(id);
    }

    public Adoptante saveAdoptante(Adoptante adoptante) {
        return adoptanteRepository.save(adoptante);
    }

    public void deleteAdoptante(Long id) {
        adoptanteRepository.deleteById(id);
    }
}
