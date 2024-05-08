package RuntimeExceptions;

import org.w3c.dom.ls.LSException;

public class LS {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la serialización de documentos XML
            throw new LSException((short) 1, "Error en la serialización de XML");
        } catch (LSException e) {
            System.out.println("Error de LS: " + e.getMessage());
        }
    }
}
