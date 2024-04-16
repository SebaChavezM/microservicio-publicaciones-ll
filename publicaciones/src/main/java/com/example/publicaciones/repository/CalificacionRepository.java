package com.example.publicaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.publicaciones.model.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
}