package RuntimeExceptions;

import java.util.EmptyStackException;
import java.util.Stack;

public class EmptyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        try {
            // Intentamos extraer un elemento de una pila vacía
            String element = stack.pop();
            System.out.println("Elemento extraído: " + element);
        } catch (EmptyStackException e) {
            System.out.println("¡Se ha producido una EmptyStackException!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
