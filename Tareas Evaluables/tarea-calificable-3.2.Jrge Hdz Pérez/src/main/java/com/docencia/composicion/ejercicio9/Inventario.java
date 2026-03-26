package com.docencia.composicion.ejercicio9;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase Inventario
 * @author jhdezprez
 * @version 1.0.0
 */
public class Inventario {
    private final List<LineaInventario> lineas = new ArrayList<>();

    public void anadirStock(String nombreProducto, int cantidad) {

        nombreProducto.trim().toLowerCase();
        
        lineas.add(new LineaInventario(new Producto(nombreProducto), cantidad));
    }

    public boolean retirarStock(String nombreProducto, int cantidad) {
        // TODO: implementar según enunciado/tests.
        return false;
    }

    public int stockDe(String nombreProducto) {
        // TODO: implementar según enunciado/tests.
        int resultado =0;
        for (LineaInventario lineaInventario : lineas) {
            if ( lineaInventario != null){
                if (lineaInventario.getProducto().getNombre().toLowerCase().equals(nombreProducto)){
                    resultado = resultado + lineaInventario.getCantidad();
                }
            }
        }
        return 0;
    }

    public int totalUnidades() {
        int total = 0;
        
        return total;
    }

    public List<LineaInventario> getLineas() {
        return new ArrayList<>(lineas);
    }
}
