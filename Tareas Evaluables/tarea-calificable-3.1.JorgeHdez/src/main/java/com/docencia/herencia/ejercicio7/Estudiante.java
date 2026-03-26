package com.docencia.herencia.ejercicio7;
   
/**
 * Clase Estudiante que hereda de persona
 * @author jhdezprez
 * @version 1.0.0
 */
public class Estudiante extends Persona {
    private final String curso;


    public Estudiante(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String descripcionRol() {
        // TODO: devolver descripción según tests.
        if (nombre == null || nombre.isEmpty()){
            return "Estudiante " + " del curso " + curso;
        }
        if (curso == null || curso.isBlank()){
            return "Estudiante " + nombre + " del curso ";
        }
        return "Estudiante "+ nombre + " del curso " + curso;
    }
}
