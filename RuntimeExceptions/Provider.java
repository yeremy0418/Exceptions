package RuntimeExceptions;

import java.security.ProviderException;

public class Provider {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con un proveedor de seguridad
            throw new ProviderException("Error: proveedor de seguridad no válido");
        } catch (ProviderException e) {
            System.out.println("Error de proveedor: " + e.getMessage());
        }
    }
}
