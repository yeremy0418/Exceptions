package RuntimeExceptions;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            int dividendo = 10;
            int divisor = 0;
            int resultado = dividendo / divisor;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
