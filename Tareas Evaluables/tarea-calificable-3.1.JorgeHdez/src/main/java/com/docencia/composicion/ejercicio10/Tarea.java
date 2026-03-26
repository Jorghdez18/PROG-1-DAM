package com.docencia.composicion.ejercicio10;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase Tarea 
 * @author jhdezprez
 * @version 1.0.0
 */
public class Tarea {
    private final String descripcion;
    private boolean completada;
    private boolean incompleta;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    public boolean isincompleta(){
        return incompleta;
    }
}
