package RuntimeExceptions;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

public class BufferOverflow {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(4);
            buffer.putInt(123); // Agregamos un entero al buffer de 4 bytes

            // Intentamos agregar otro entero al buffer, lo cual causará una BufferOverflowException
            buffer.putInt(456);
        } catch (BufferOverflowException e) {
            System.out.println("¡Se ha producido una BufferOverflowException! El buffer no tiene suficiente espacio para almacenar más datos.");
            e.printStackTrace();
        }
    }
}
