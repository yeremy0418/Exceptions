package RuntimeExceptions;

public class ClassCast {
    public static void main(String[] args) {
        try {
            Object obj = "Hola";
            Integer num = (Integer) obj; // Intentamos convertir un String a Integer
        } catch (ClassCastException e) {
            System.out.println("¡Se ha producido una ClassCastException!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
