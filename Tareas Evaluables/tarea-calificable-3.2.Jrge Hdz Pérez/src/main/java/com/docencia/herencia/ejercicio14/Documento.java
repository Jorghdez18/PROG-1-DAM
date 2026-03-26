package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;
/**
 * Clase abstracta Documento
 * @author jhdezprez
 * @version 1.0.0
 */

public abstract class Documento {
    private final String titulo;

    protected Documento(String titulo) {
        if (titulo == null || titulo.trim().isBlank()){
            throw new IllegalArgumentException();
        }
        this.titulo = titulo.trim();
    }

    public String getTitulo() {
        return ""  + titulo;
    }



    public abstract String descripcion();
}
