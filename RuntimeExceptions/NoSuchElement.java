package RuntimeExceptions;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class NoSuchElement {
   public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con un elemento inexistente en una colección
            LinkedList<Integer> list = new LinkedList<>();
            list.removeFirst(); // Intentar eliminar el primer elemento de una lista vacía
        } catch (NoSuchElementException e) {
            System.out.println("Error de elemento inexistente: " + e.getMessage());
        }
    }  
}
