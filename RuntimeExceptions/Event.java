package RuntimeExceptions;

import org.w3c.dom.events.EventException;

public class Event {
    public static void main(String[] args) {
        try {
            // Simulamos un error al procesar un evento con un código de error personalizado
            short errorCode = 1001;
            throw new EventException(errorCode, "Error al procesar el evento personalizado");
        } catch (EventException e) {
            System.out.println("¡Se ha producido una EventException!");
            System.out.println("Código de error: " + e.code);
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}
