package RuntimeExceptions;

import java.lang.reflect.MalformedParameterizedTypeException;

public class MalformedParameterizedType {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con un tipo de parámetro mal formado
            throw new MalformedParameterizedTypeException();
        } catch (MalformedParameterizedTypeException e) {
            System.out.println("Error de tipo de parámetro mal formado: " + e.getMessage());
        }
    }
}
