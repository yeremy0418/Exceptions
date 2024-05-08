package RuntimeExceptions;

public class NullPointer {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la referencia nula de un objeto
            String text = null;
            int length = text.length(); // Intentar acceder a un método de un objeto nulo
        } catch (NullPointerException e) {
            System.out.println("Error de referencia nula: " + e.getMessage());
        }
    }
}
