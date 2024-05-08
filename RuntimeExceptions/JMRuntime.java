package RuntimeExceptions;

import javax.management.JMRuntimeException;

public class JMRuntime {
  public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la gestión de JMX
            throw new JMRuntimeException("Error en la gestión de JMX");
        } catch (JMRuntimeException e) {
            System.out.println("Error de JMX: " + e.getMessage());
        }
    }  
}
