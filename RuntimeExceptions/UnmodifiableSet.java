package RuntimeExceptions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSet {
    public static void main(String[] args) {
        try {
            // Simular una excepción al intentar modificar un conjunto no modificable
            Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet<>());
            unmodifiableSet.add("elemento"); // Intentar agregar un elemento al conjunto no modificable
        } catch (UnsupportedOperationException e) {
            System.out.println("Error de conjunto no modificable: " + e.getMessage());
        }
    }
}
