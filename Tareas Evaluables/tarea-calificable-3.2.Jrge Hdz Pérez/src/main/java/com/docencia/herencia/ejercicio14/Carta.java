package com.docencia.herencia.ejercicio14;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Carta extendida de documento
 * @author jhdezprez
 * @version 1.0.0
 */
public class Carta extends Documento {


    public Carta(String titulo) {
        super(titulo);
        //TODO Auto-generated constructor stub
    }

    private String destinatario;

    public void setDestinatario(String destinatario) {
        if (destinatario == null || destinatario.trim().isBlank()){
            throw new IllegalArgumentException();
        }
        this.destinatario = destinatario.trim();
    }
    public String getDestinatario() {
        return destinatario.trim();
    }

    @Override
    public String descripcion() {
        return "Carta: " + getTitulo() + " | Para: " + getDestinatario();
    }
}
