package com.example.publicaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.publicaciones.model.Calificacion;
import com.example.publicaciones.repository.CalificacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionServiceImpl implements CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    @Override
    public List<Calificacion> getAllCalificaciones() {
        return calificacionRepository.findAll();
    }

    @Override
    public Optional<Calificacion> getCalificacionById(Long id) {
        return calificacionRepository.findById(id);
    }

    @Override
    public Calificacion saveCalificacion(Calificacion calificacion) {
        return calificacionRepository.save(calificacion);
    }

    @Override
    public void deleteCalificacion(Long id) {
        calificacionRepository.deleteById(id);
    }
}