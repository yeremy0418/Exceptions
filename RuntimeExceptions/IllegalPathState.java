package RuntimeExceptions;

import java.awt.geom.Path2D;
import java.awt.geom.IllegalPathStateException;

public class IllegalPathState {
    public static void main(String[] args) {
        // Crear un nuevo objeto Path2D
        Path2D path = new Path2D.Double();

        // Agregar un punto al objeto Path2D
        path.moveTo(10, 20);

        // Intentar agregar una línea sin un punto de inicio
        try {
            path.lineTo(30, 40);
        } catch (IllegalPathStateException e) {
            System.out.println("IllegalPathStateException caught: " + e.getMessage());
        }
    } 
}
