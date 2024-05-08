package RuntimeExceptions;

import java.util.Collections;
import java.util.List;

public class UnsupportedOperation {
    public static void main(String[] args) {
        try {
            // Simular una excepción al intentar realizar una operación no admitida en una lista no modificable
            List<String> unmodifiableList = Collections.singletonList("elemento");
            unmodifiableList.add("nuevo elemento"); // Intentar agregar un elemento a la lista no modificable
        } catch (UnsupportedOperationException e) {
            System.out.println("Error de operación no admitida: " + e.getMessage());
        }
    }
}
