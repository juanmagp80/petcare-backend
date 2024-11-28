package com.example.petcare_backend.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "animales")  // Nombre de la tabla en la base de datos
public class Animal {

    @Id
    private Long id;

    private Integer edad;

    private String estado;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    private String foto;

    private String tipo;

    // Constructores, getters y setters

    public Animal() {
    }

    public Animal(Long id, Integer edad, String estado, LocalDate fechaIngreso, String foto, String tipo) {
        this.id = id;
        this.edad = edad;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.foto = foto;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
