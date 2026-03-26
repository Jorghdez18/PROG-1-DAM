package com.docencia.model;

import java.time.LocalDate;
import java.util.Objects;

public class Profesor extends Persona {
    public Profesor(int id, String nombre, String documento, String email, LocalDate fechaNacimiento, LocalDate fechaRegistro, String departamento) {
        super(id);
        //TODO Auto-generated constructor stub
    }

    /** 

    private String departamento;

    /**
     * Constructor con identificador de Profesor, heredado de persna
     * @param id
     */
    /** 
    public Profesor(int id) {
        super(id);
    }
    */
    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipo'");
    }

    /** 
    /**
     * Constructor con parametros de la clase profesor
     * @param id de persona
     * @param nombre nombre de persona
     * @param documento documento de persona
     * @param email email de persona
     * @param fechaNacimiento fecha de nacimiento de la persona
     * @param fechaRegistro fecha de regidtro de la persona
     * @param departamento departamento al que pertenece el profesor
     */

    /** 
    public Profesor(int id, String nombre, String documento, String email,
    LocalDate fechaNacimiento, LocalDate fechaRegistro,
    String departamento){
        super(id, nombre, documento, email, fechaNacimiento, fechaRegistro);
        this.departamento =departamento;

    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Profesor departamento(String departamento) {
        setDepartamento(departamento);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(departamento, profesor.departamento);
    }

    @Override
    public int hashCode() {
        return super.hashCode()(departamento);
    }

    @Override
    public String toString() {
        return "{" +
            " departamento='" + getDepartamento() + "'" +
            "}";
    }
    





*/    

}
