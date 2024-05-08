package RuntimeExceptions;

public class ArrayStore {
    public static void main(String[] args) {
        try {
            Object[] array = new Integer[10];
            array[0] = "Hola"; // Intentando almacenar un String en un array de Integers
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
    }
}
