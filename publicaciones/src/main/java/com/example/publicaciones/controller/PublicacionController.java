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

import com.example.publicaciones.model.Publicacion;
import com.example.publicaciones.service.PublicacionService;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    public List<Publicacion> getAllPublicaciones() {
        return publicacionService.getAllPublicaciones();
    }

    @GetMapping("/{id}")
    public Optional<Publicacion> getPublicacionById(@PathVariable Long id) {
        return publicacionService.getPublicacionById(id);
    }

    @PostMapping
    public Publicacion savePublicacion(@RequestBody Publicacion publicacion) {
        return publicacionService.savePublicacion(publicacion);
    }

    @DeleteMapping("/{id}")
    public void deletePublicacion(@PathVariable Long id) {
        publicacionService.deletePublicacion(id);
    }
}
