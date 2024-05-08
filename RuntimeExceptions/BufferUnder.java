package RuntimeExceptions;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public class BufferUnder {
    public static void main(String[] args) {
        // Creamos un buffer con capacidad para 3 bytes
        ByteBuffer buffer = ByteBuffer.allocate(3);

        // Agregamos algunos elementos al buffer
        buffer.put(new byte[] { 1, 2 });

        // Nos aseguramos de que el buffer esté listo para leer
        buffer.flip();

        try {
            // Intentamos leer más elementos de los que hay en el buffer
            for (int i = 0; i < 3; i++) {
                System.out.println(buffer.get());
            }
        } catch (BufferUnderflowException ex) {
            System.out.println("¡Error! Se produjo un subdesbordamiento del buffer.");
            ex.printStackTrace();
        }
    }
}
