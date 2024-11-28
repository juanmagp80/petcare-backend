package com.example.petcare_backend.controller;

import com.example.petcare_backend.model.Adopcion;
import com.example.petcare_backend.service.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adopciones")
public class AdopcionController {

    @Autowired
    private AdopcionService adopcionService;

    @GetMapping
    public List<Adopcion> getAllAdopciones() {
        return adopcionService.getAllAdopciones();
    }

    @GetMapping("/{id}")
    public Optional<Adopcion> getAdopcionById(@PathVariable Long id) {
        return adopcionService.getAdopcionById(id);
    }

    @PostMapping
    public Adopcion createAdopcion(@RequestBody Adopcion adopcion) {
        return adopcionService.saveAdopcion(adopcion);
    }

    @DeleteMapping("/{id}")
    public void deleteAdopcion(@PathVariable Long id) {
        adopcionService.deleteAdopcion(id);
    }
}
