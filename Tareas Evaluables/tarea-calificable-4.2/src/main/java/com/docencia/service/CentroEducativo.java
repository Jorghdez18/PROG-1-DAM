package com.docencia.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.docencia.model.Alumno;
import com.docencia.model.Persona;
import com.docencia.model.Profesor;
import com.docencia.util.Validaciones;

public class CentroEducativo {
    private List<Persona> personas;
    private Set<String> documentosRegistrados;
    private Set<String> emailsRegidtrados;

    public CentroEducativo() {
        personas = new ArrayList<>();
        documentosRegistrados = new HashSet<>();
        emailsRegidtrados = new HashSet<>();
    }

    public List<Persona> listaPersonas() {
        return List.copyOf(personas);
    }

    public Persona buscarPorId(int id) {
        Persona personaABuscar = new Alumno(id);
        int posicion = personas.indexOf(personaABuscar); // posicion que ocupa dentro de la lista
        if (posicion < 0) {
            return null;
        }
        return personas.get(posicion);

    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona instanceof Alumno) {
                alumnos.add((Alumno) persona);
            }

        }
        return alumnos;

    }

    public List<Profesor> listarProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona.getTipo() == "PROFESOR") {
                profesores.add((Profesor) persona);
            }
        }
        return profesores;
    }

    public boolean registrarPersona(Persona persona) {
        if (persona == null || persona.getId() <= 0) {
            return false;
        }
        if (personas.contains(persona)) {
            return false;
        }
        if (emailsRegidtrados.contains(persona.getEmail())) {
            return false;
        }
        if (documentosRegistrados.contains(persona.getDocumento())) {
            return false;
        }
        if (!Validaciones.validacionDocumento(persona.getDocumento())) {
            throw new IllegalArgumentException("El documento tiene un formato invalido");
        }
        if (!Validaciones.validacionEmail(persona.getEmail())) {
            throw new IllegalArgumentException("El email tiene un formato invalido");
        }
        documentosRegistrados.add(persona.getDocumento());
        emailsRegidtrados.add(persona.getEmail());

        return personas.add(persona);
    }
    public Persona buscarPorDocumento(String documento){
        if (documento == null || documento.isBlank()){
            return null;
        }
        if (!
            documentosRegistrados.contains(documento)){
            return null;
        }
        //hacer un foreach sobre personas
        return null;
    }
}
