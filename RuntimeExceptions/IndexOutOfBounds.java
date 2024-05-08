package RuntimeExceptions;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        try {
            // Intentar acceder a un índice fuera de los límites de un arreglo
            int[] array = {1, 2, 3};
            int value = array[5];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error de índice fuera de los límites del arreglo: " + e.getMessage());
        }
    }
}
