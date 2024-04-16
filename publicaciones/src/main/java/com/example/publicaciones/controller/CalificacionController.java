package com.example.publicaciones.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.publicaciones.model.Calificacion;
import com.example.publicaciones.service.CalificacionService;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public List<Calificacion> getAllCalificaciones() {
        return calificacionService.getAllCalificaciones();
    }

    @GetMapping("/{id}")
    public Optional<Calificacion> getCalificacionById(@PathVariable Long id) {
        return calificacionService.getCalificacionById(id);
    }

    @PostMapping
    public Calificacion saveCalificacion(@RequestBody Calificacion calificacion) {
        return calificacionService.saveCalificacion(calificacion);
    }

    @DeleteMapping("/{id}")
    public void deleteCalificacion(@PathVariable Long id) {
        calificacionService.deleteCalificacion(id);
    }
}