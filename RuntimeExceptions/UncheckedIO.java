package RuntimeExceptions;

import java.io.IOException;
import java.io.UncheckedIOException;

public class UncheckedIO {
    public static void main(String[] args) {
        try {
            // Simular una excepción de E/S que no se comprueba
            throw new UncheckedIOException(new IOException("Error de E/S no comprobado"));
        } catch (UncheckedIOException e) {
            System.out.println("Error de E/S no comprobado: " + e.getMessage());
        }
    }
}
