package com.docencia.listas.ejercicio16;

import java.util.List;

/**
 * Ejercicio 16
 *
 * Clase lanzadora (opcional) y contenedor de métodos del enunciado.
 * 
 * @author jhdezprez
 * @version 1.0.0
 */

public class Ejercicio16 {

    private Ejercicio16() {
    }

    public static void main(String[] args) {
        // Puedes ejecutar aquí pruebas manuales rápidas si lo deseas.
    }

    /**
     * TODO: Implementar completamente según enunciado y tests.
     */
    public static int sumarLongitudesNoVacias(List<String> textos) {
        // Implementación provisional: siempre 0.
        if (textos == null || textos.isEmpty()) {
            return 0;
        }
        int resultado = 0;
        for (String texto : textos) {
            if (texto != null) {
                texto = texto.trim();
                if (texto != null || texto.isEmpty()) {
                    resultado = resultado + texto.length();

                }

            }
        }
        return resultado;
    }

}
