package RuntimeExceptions;

import javax.xml.crypto.NoSuchMechanismException;

public class NoSuchMechanism {
   public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con un mecanismo inexistente en criptografía XML
            throw new NoSuchMechanismException("Error: mecanismo de criptografía inexistente");
        } catch (NoSuchMechanismException e) {
            System.out.println("Error de mecanismo inexistente: " + e.getMessage());
        }
    } 
}
