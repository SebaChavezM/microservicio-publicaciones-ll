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

import com.example.publicaciones.model.Comentario;
import com.example.publicaciones.service.ComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> getAllComentarios() {
        return comentarioService.getAllComentarios();
    }

    @GetMapping("/{id}")
    public Optional<Comentario> getComentarioById(@PathVariable Long id) {
        return comentarioService.getComentarioById(id);
    }

    @PostMapping
    public Comentario saveComentario(@RequestBody Comentario comentario) {
        return comentarioService.saveComentario(comentario);
    }

    @DeleteMapping("/{id}")
    public void deleteComentario(@PathVariable Long id) {
        comentarioService.deleteComentario(id);
    }
}
