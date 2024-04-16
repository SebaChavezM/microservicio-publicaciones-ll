package com.example.publicaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.publicaciones.model.Comentario;
import com.example.publicaciones.repository.ComentarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> getAllComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Optional<Comentario> getComentarioById(Long id) {
        return comentarioRepository.findById(id);
    }

    @Override
    public Comentario saveComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    @Override
    public void deleteComentario(Long id) {
        comentarioRepository.deleteById(id);
    }
}