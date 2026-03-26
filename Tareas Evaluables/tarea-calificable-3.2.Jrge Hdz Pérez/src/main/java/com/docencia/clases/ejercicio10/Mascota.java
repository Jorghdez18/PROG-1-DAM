package com.docencia.clases.ejercicio10;

import java.util.Objects;

/**
 * Clase Principal Mascota
 * @author jhdezprez
 * @version 1.0.0
 */
public class Mascota {
    private String chip;
    private String nombre;
    private String tipo;

    /**
     * Constrcutor vacio de la clase
     */
    public Mascota() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    /**
     * Constructor para identificador unico
     * @param chip parametro chip, identificador unico
     */
    public Mascota(String chip) {
        // TODO: constructor con identificador único
        this.chip = chip;
    }

    /**
     * Getters y Setters de la clase mascota
     */
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Hash Code y Equals
     */

     @Override
    public int hashCode() {
        return Objects.hash(chip, nombre, tipo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mascota other = (Mascota) obj;
        return Objects.equals(chip, other.chip) && Objects.equals(nombre, other.nombre)
                && Objects.equals(tipo, other.tipo);
    }
    

    /**
     * Metodo toString
     */
    @Override
    public String toString() {
        return "{" +
            " chip='" + getChip() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
    
}
