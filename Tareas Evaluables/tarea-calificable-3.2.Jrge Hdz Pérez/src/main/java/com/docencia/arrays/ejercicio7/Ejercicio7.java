package com.docencia.arrays.ejercicio7;

/**
 * Clase que compara arrays
 * @author jhdezprez
 * @version 1.0.0
 */
public class Ejercicio7 {
    /**
     * Devuelve true si ambos arrays tienen la misma longitud y mismos valores en cada posición.
     */
    public static boolean sonIguales(int[] array1, int[] array2) {
        // TODO: implementar usando un bucle for (no usar streams)
        if (array1 == null || array2 == null || array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]){
                return false;
            }
            
        }
        
        
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Ejercicio7 listo para implementar.");
    }
}

