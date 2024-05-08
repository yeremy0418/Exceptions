package RuntimeExceptions;

public class NegativeArraySize {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con el tamaño negativo de un arreglo
            int[] array = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Error de tamaño negativo de arreglo: " + e.getMessage());
        }
    } 
}
