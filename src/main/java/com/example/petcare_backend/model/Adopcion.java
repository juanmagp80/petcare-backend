package com.example.petcare_backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "adopciones") // Nombre de la tabla en la base de datos
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Asumiendo que el ID es auto-incremental
    private Long id;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;  // Relación con la entidad Animal

    @ManyToOne
    @JoinColumn(name = "adoptante_id", nullable = false)
    private Adoptante adoptante;  // Relación con la entidad Adoptante

    @Column(name = "fecha_adopcion")
    private LocalDate fechaAdopcion;  // Fecha de adopción

    // Constructores, getters y setters

    public Adopcion() {
    }

    public Adopcion(Animal animal, Adoptante adoptante, LocalDate fechaAdopcion) {
        this.animal = animal;
        this.adoptante = adoptante;
        this.fechaAdopcion = fechaAdopcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }

    public LocalDate getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(LocalDate fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }
}
