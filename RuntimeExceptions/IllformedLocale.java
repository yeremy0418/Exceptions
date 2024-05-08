package RuntimeExceptions;

import java.util.IllformedLocaleException;
import java.util.Locale;

public class IllformedLocale {
    public static void main(String[] args) {
        try {
            // Intentar crear una instancia de Locale con una cadena mal formada
            Locale locale = new Locale("es", "ES", "invalid"); // "invalid" no es una subtag válida
            System.out.println("Locale creado: " + locale);
        } catch (IllformedLocaleException e) {
            System.out.println("Error al crear el Locale: " + e.getMessage());
        }
    }
}
