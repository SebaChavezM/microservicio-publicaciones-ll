package com.example.publicaciones.service;

import com.example.publicaciones.model.Calificacion;

import java.util.List;
import java.util.Optional;

public interface CalificacionService {
    List<Calificacion> getAllCalificaciones();
    Optional<Calificacion> getCalificacionById(Long id);
    Calificacion saveCalificacion(Calificacion calificacion);
    void deleteCalificacion(Long id);
}