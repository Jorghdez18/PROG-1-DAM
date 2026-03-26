package com.docencia.clases.ejercicio6;

import java.util.Objects;

/**
 * Clase de Pedido
 * @author jhdezprez
 * @version 1.0.0
 */
public class Pedido {
    private String codigo;
    private double importe;
    private String estado;

    /**
     * Constrcutor vacio de la clase pedido
     */
    public Pedido() {
        // TODO: constructor vacío (dejar valores por defecto o inicializar si lo necesitas)
    }

    public Pedido(String codigo) {
       this.codigo = codigo; 
    }
    /**
     * Getters y setters
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Hash code and equals
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigo); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        return Objects.equals(codigo, other.codigo)
                && Double.doubleToLongBits(importe) == Double.doubleToLongBits(other.importe)
                && Objects.equals(estado, other.estado);
    }

    /**
     * Metodo ToString
     */
    @Override
    public String toString() {
        return "Pedido [codigo=" + codigo + ", importe=" + importe + ", estado=" + estado + "]";
    }

    
}
