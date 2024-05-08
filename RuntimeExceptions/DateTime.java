package RuntimeExceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        try {
            // Intentamos analizar una fecha con un formato incorrecto
            String dateString = "2023-02-30"; // Febrero no tiene 30 días
            LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Fecha válida: " + date);
        } catch (DateTimeException e) {
            System.out.println("¡Se ha producido una DateTimeException!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}