package com.docencia.composicion.ejercicio10;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestora de proyectos
 * @author jhdezprez
 * @version 1.0.0
 */
public class GestorProyectos {
    private final List<Proyecto> proyectos = new ArrayList<>();
    private final List<String> tareasIncompletas = new ArrayList<>();
    
    public Proyecto crearProyecto(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            return null;
        }
        nombre = nombre.trim();
        Proyecto p = new Proyecto(nombre);
        proyectos.add(p);
        return p;
    }

    public boolean anadirTareaAProyecto(String nombreProyecto, String descripcionTarea) {
        if (nombreProyecto == null || nombreProyecto.isBlank()){
            return false;
        }
            
        return false;
    }

    public int contarTareasPendientes(String nombreProyecto) {
        
        return tareasIncompletas.size();
    }

    public List<Proyecto> getProyectos() {
        return new ArrayList<>(proyectos);
    }
}
