package com.example.petcare_backend.controller;

import com.example.petcare_backend.model.Adoptante;
import com.example.petcare_backend.service.AdoptanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adoptantes")
public class AdoptanteController {

    @Autowired
    private AdoptanteService adoptanteService;

    @GetMapping
    public List<Adoptante> getAllAdoptantes() {
        return adoptanteService.getAllAdoptantes();
    }

    @GetMapping("/{id}")
    public Optional<Adoptante> getAdoptanteById(@PathVariable Long id) {
        return adoptanteService.getAdoptanteById(id);
    }

    @PostMapping
    public Adoptante createAdoptante(@RequestBody Adoptante adoptante) {
        return adoptanteService.saveAdoptante(adoptante);
    }

    @DeleteMapping("/{id}")
    public void deleteAdoptante(@PathVariable Long id) {
        adoptanteService.deleteAdoptante(id);
    }
}
