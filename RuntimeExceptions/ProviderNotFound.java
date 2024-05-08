package RuntimeExceptions;

import java.nio.file.ProviderNotFoundException;

public class ProviderNotFound {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la falta de un proveedor de seguridad
            throw new ProviderNotFoundException("Error: proveedor de seguridad no encontrado");
        } catch (ProviderNotFoundException e) {
            System.out.println("Error de proveedor no encontrado: " + e.getMessage());
        }
    }
}
