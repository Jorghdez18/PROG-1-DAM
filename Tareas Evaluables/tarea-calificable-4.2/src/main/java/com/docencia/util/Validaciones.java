package com.docencia.util;

import java.util.regex.Pattern;

public class Validaciones {

    public static boolean validacionDocumento(String documento) {
        if (documento == null) {
            throw new IllegalArgumentException();
        }
        return false;
    }

    public static boolean validacionEmail(String email) {
        if (email.isBlank() || email == null) {
            throw new IllegalArgumentException();
        }
        
        String patron = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        return Pattern.matches(patron, email);
    }

}
