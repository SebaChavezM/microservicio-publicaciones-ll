package com.example.publicaciones.service;

import com.example.publicaciones.model.Comentario;

import java.util.List;
import java.util.Optional;

public interface ComentarioService {
    List<Comentario> getAllComentarios();
    Optional<Comentario> getComentarioById(Long id);
    Comentario saveComentario(Comentario comentario);
    void deleteComentario(Long id);
}