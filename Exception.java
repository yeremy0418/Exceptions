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
