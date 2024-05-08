package RuntimeExceptions;

import java.lang.invoke.WrongMethodTypeException;

public class WrongMethodType {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con un tipo de método incorrecto
            throw new WrongMethodTypeException("Error: tipo de método incorrecto");
        } catch (WrongMethodTypeException e) {
            System.out.println("Error de tipo de método incorrecto: " + e.getMessage());
        }
    }
}
