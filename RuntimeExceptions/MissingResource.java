package RuntimeExceptions;

import java.util.MissingResourceException;

import javax.lang.model.type.MirroredTypesException;

public class MissingResource {
     public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la falta de recursos
            throw new MissingResourceException("Error: recurso no encontrado", "Archivo", "clave");
        } catch (MissingResourceException e) {
            System.out.println("Error de recurso faltante: " + e.getMessage());
        }
    }
}
