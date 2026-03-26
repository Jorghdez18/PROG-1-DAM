package com.docencia.herencia.ejercicio7;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase Persona
 * @author jhdezprez
 * @version 1.0.0
 */
public abstract class Persona {
    protected final String nombre;

    protected Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String descripcionRol();
}
