package RuntimeExceptions;

import java.lang.annotation.IncompleteAnnotationException;

public class IncompleteAnnotation {
    public static void main(String[] args) {
        try {
            // Intentar crear una anotación incompleta
            throw new IncompleteAnnotationException(null, "Missing element in annotation");
        } catch (IncompleteAnnotationException e) {
            System.out.println("Error de anotación incompleta: " + e.getMessage());
        }
    }
}
