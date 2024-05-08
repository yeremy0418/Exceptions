class Arithmetic {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        int result;

        try {
            result = dividend / divisor;
            System.out.println("El resultado de la división es: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Excepción: División por cero.");
            e.printStackTrace();
        }
    }
}

class ArrayStore {
    public static void main(String[] args) {
        Object[] objects = new Integer[5];

        try {
            objects[0] = "Hola";
        } catch (ArrayStoreException e) {
            System.err.println("Excepción: Intento de almacenar un tipo incorrecto en un arreglo.");
            e.printStackTrace();
        }
    }
}

class ClassCast{
    public static void main(String[] args) {
        Object obj = "Hola";

        try {
            Integer intValue = (Integer) obj;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}

class DateTime{
    public static void main(String[] args) {
        // Intentamos convertir una cadena en una fecha utilizando un formato incorrecto
        String dateStr = "2022-13-05"; // Error: el mes 13 es inválido
        try {
            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Fecha parseada correctamente: " + date);
        } catch (DateTimeParseException e) {
            // Capturamos la excepción y manejamos el error
            System.err.println("Excepción durante el parseo de la fecha:");
            e.printStackTrace();
        }
    }
}

