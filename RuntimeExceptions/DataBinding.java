package RuntimeExceptions;

public class DataBinding {
    public static void main(String[] args) {
        try {
            // Simulamos un error en el proceso de enlace de datos
            throw new DataBindingException("Error en el enlace de datos: Valor no válido");
        } catch (DataBindingException e) {
            System.out.println("¡Se ha producido una DataBindingException!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    static class DataBindingException extends Exception {
        public DataBindingException(String message) {
            super(message);
        }
    }
}
