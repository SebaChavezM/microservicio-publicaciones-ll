package com.example.publicaciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMENTARIOS")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_publicacion")
    private Long idPublicacion;

    @Column(name = "contenido")
    private String contenido;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setPublicacion(Publicacion publicacion) {
        throw new UnsupportedOperationException("Unimplemented method 'setPublicacion'");
    }
}