package RuntimeExceptions;

public class TypeNotPresent {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la ausencia de un tipo
            throw new TypeNotPresentException("java.util.List", new ClassNotFoundException("Tipo no encontrado"));
        } catch (TypeNotPresentException e) {
            System.out.println("Error de tipo no presente: " + e.getMessage());
        }
    }
}
