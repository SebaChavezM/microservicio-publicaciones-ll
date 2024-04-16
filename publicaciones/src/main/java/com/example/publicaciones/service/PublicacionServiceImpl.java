package com.example.publicaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.publicaciones.model.Calificacion;
import com.example.publicaciones.model.Comentario;
import com.example.publicaciones.model.Publicacion;
import com.example.publicaciones.repository.PublicacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionServiceImpl implements PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> getAllPublicaciones() {
        return publicacionRepository.findAll();
    }

    @Override
    public Optional<Publicacion> getPublicacionById(Long id) {
        return publicacionRepository.findById(id);
    }

    @Override
    public Publicacion savePublicacion(Publicacion publicacion) {
        return publicacionRepository.save(publicacion);
    }

    @Override
    public void deletePublicacion(Long id) {
        publicacionRepository.deleteById(id);
    }

    @Override
    public List<Comentario> getComentariosByPublicacionId(Long publicacionId) {
        throw new UnsupportedOperationException("Unimplemented method 'getComentariosByPublicacionId'");
    }

    @Override
    public List<Calificacion> getCalificacionesByPublicacionId(Long publicacionId) {
        throw new UnsupportedOperationException("Unimplemented method 'getCalificacionesByPublicacionId'");
    }

    @Override
    public Comentario saveComentario(Long publicacionId, Comentario comentario) {
        throw new UnsupportedOperationException("Unimplemented method 'saveComentario'");
    }

    @Override
    public Calificacion saveCalificacion(Long publicacionId, Calificacion calificacion) {
        throw new UnsupportedOperationException("Unimplemented method 'saveCalificacion'");
    }
}