import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class AnnotationTypeMismatch {
    @MyAnnotation("someValue")
    public static void myMethod() {
        // Aquí iría la implementación del método
    }

    public static void main(String[] args) {
        try {
            // Obtenemos la anotación del método
            MyAnnotation annotation = AnnotationTypeMismatch.class.getMethod("myMethod").getAnnotation(MyAnnotation.class);
            
            // Intentamos acceder a un valor que no es compatible con el tipo esperado
            int valor = Integer.parseInt(annotation.value());
        } catch (NoSuchMethodException | AnnotationTypeMismatchException e) {
            e.printStackTrace();
        }
    }
}