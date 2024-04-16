package com.example.publicaciones.service;

import com.example.publicaciones.model.Calificacion;
import com.example.publicaciones.model.Comentario;
import com.example.publicaciones.model.Publicacion;

import java.util.List;
import java.util.Optional;

public interface PublicacionService {
    List<Publicacion> getAllPublicaciones();
    Optional<Publicacion> getPublicacionById(Long id);
    Publicacion savePublicacion(Publicacion publicacion);
    void deletePublicacion(Long id);
    List<Comentario> getComentariosByPublicacionId(Long publicacionId);
    List<Calificacion> getCalificacionesByPublicacionId(Long publicacionId);
    Comentario saveComentario(Long publicacionId, Comentario comentario);
    Calificacion saveCalificacion(Long publicacionId, Calificacion calificacion);
}
