package RuntimeExceptions;

import java.lang.reflect.UndeclaredThrowableException;

public class UndeclaredThrowable {
    public static void main(String[] args) {
        try {
            // Simular una excepción no declarada en una reflexión
            throw new UndeclaredThrowableException(new Exception("Error no declarado"));
        } catch (UndeclaredThrowableException e) {
            System.out.println("Error no declarado: " + e.getMessage());
        }
    }
}
