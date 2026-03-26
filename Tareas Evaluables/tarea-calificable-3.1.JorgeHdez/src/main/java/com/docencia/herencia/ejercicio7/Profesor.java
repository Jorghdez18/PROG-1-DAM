package com.docencia.herencia.ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de Profesor, que hereda de Persona
 * @author jhdezprez
 * @version 1.0.0
 */
public class Profesor extends Persona {
        private final String especialidad;

        public Profesor(String nombre, String especialidad) {
            super(nombre);
            this.especialidad = especialidad;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        @Override
        public String descripcionRol() {
            // TODO: devolver descripción según tests.
            if (nombre == null || nombre.isBlank()){
                return "Profesor  de " + especialidad;
            }
            if (especialidad == null || especialidad.isBlank()){
                return "Profesor " + nombre + " de ";
            }

            return "Profesor " + nombre + " de " + especialidad;
        }
    public static List<String> descripciones(List<Persona> personas) {
        // TODO: devolver lista de descripciones de personas no nulas.
        descripciones(personas);
    
        return new ArrayList<>();
    }    
    }

    
