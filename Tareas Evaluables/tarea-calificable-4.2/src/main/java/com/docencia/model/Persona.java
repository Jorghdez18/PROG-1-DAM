package com.docencia.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Persona {
    private final int id;
    private String nombre;
    private String documento;
    private String email;
    private LocalDate fechaNacimiento;
    private final LocalDate fechaRegistro;


    public abstract String getTipo();

    /**
     * Constructor con los atributos finales
     * @param id id de la persona
     * @param fechaRegistro fecha de regitro en la aplicacion de la persona
     */
    public Persona(int id) {
        this.id = id;
        fechaRegistro =  LocalDate.now();
    }

    /**
     * Constructor con parametros de la clase persona
     * @param id id de la persona
     * @param nombre nombre de la persona
     * @param documento documento de la persona
     * @param email email de la persona
     * @param fechaNacimiento fecha de nacimiento de a persona
     * @param fechaRegistro fecha de registro de la persona
     */
    public Persona(int id, String nombre, String documento, String email,
            LocalDate fechaNacimiento, LocalDate fechaRegistro) {
                if (id <= 0){
                    throw new IllegalArgumentException("El id tiene que tener valor");
                }
                this.id = id;
                setNombre(nombre);
                this.documento = documento;
                setEmail(email);
                setFechaNacimiento(fechaNacimiento);
                if (fechaRegistro == null || fechaRegistro.isAfter(LocalDate.now())){
                    throw new IllegalArgumentException();
                }
                this.fechaRegistro = fechaRegistro;

    }


    /**
     * Getters y Setters de la clase persona
     * @return parametros de la clase
     */

    public int getId() {
        return this.id;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().length() < 2){
                    throw new IllegalArgumentException("El nombre de no puede ser ni nulo, ni tener solo 2 caracteres");
                }
        this.nombre = nombre;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public final LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }


    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona documento(String documento) {
        setDocumento(documento);
        return this;
    }

    public Persona email(String email) {
        setEmail(email);
        return this;
    }

    public Persona fechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null || fechaNacimiento.isAfter(LocalDate.now())){
                    throw new IllegalArgumentException("Fecha invalida");
                }
        setFechaNacimiento(fechaNacimiento);
        return this;
    }

    /**
     * Hash code and Equals de la clase persona
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return id == persona.id && Objects.equals(nombre, persona.nombre) && Objects.equals(documento, persona.documento) && Objects.equals(email, persona.email) && Objects.equals(fechaNacimiento, persona.fechaNacimiento) && Objects.equals(fechaRegistro, persona.fechaRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, documento, email, fechaNacimiento, fechaRegistro);
    }

    /**
     * ToString de persona
     */
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", documento='" + getDocumento() + "'" +
            ", email='" + getEmail() + "'" +
            ", fechaNacimiento='" + getFechaNacimiento() + "'" +
            ", fechaRegistro='" + getFechaRegistro() + "'" +
            "}";
    }
    
}
