package RuntimeExceptions;

public class Security {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la seguridad
            throw new SecurityException("Error de seguridad: operación no permitida");
        } catch (SecurityException e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        }
    }
}
