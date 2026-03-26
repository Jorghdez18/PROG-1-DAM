package com.docencia.model;

import java.time.LocalDate;
import java.util.*;

public class Alumno extends Persona {

    private String curso;
    private Set<String> modulos;

    /**
     * Constructor con parametros de la clase Alumno, con parametros heredados
     * 
     * @param id              id de la persona
     * @param nombre          nombre de la persona
     * @param documento       documento de la persona
     * @param email           email de la persona
     * @param fechaNacimiento fecha de nacimiento de a persona
     * @param fechaRegistro   fecha de registro de la persona
     * @param curso           curso donde esta el alumno
     * @param modulos         modulos que cursa la persona
     */
    public Alumno(int id, String nombre, String documento, String email, LocalDate fechaNacimiento,
            LocalDate fechaRegistro, String curso) {
        super(id, nombre, documento, email, fechaNacimiento, fechaRegistro);

        this.curso = curso;

    }

    /**
     * Constructor con parametro id de Alumno, heredado de persona
     * 
     * @param id
     */
    public Alumno(int id) {
        super(id);
    }

    /**
     * Getters y Setters de la clase Alumno
     * 
     * @return
     */
    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.length() < 3) {
            throw new IllegalArgumentException("Curso invalido");
        }
        this.curso = curso;
    }

    public Set<String> getModulos() {
        return modulos;
    }

    public Alumno curso(String curso) {
        setCurso(curso);
        return this;
    }

    /**
     * Hash code and Equals de la clase persona
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return Objects.equals(this.getId(), alumno.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }

    /**
     * ToString de la clase Alumno
     */
    @Override
    public String toString() {
        return "{" +
                " curso='" + getCurso() + "'" +
                ", modulos='" + getModulos() + "'" +
                "}";
    }


    public boolean addModulo(String modulo) {
        return modulos.add(modulo);
    }

    public boolean removeModulo(String modulo) {
        return modulos.remove(modulo);
    }

    /**
     * public Set<String> getModulos(){
     * return false;
     * }
     */

    @Override 
    public String getTipo(){
        return "ALUMNO";
    }

}
