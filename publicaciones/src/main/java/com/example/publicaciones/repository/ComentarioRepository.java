package com.example.publicaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.publicaciones.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
