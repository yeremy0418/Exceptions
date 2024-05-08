package RuntimeExceptions;

public class EnumConstantNotPresent {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        try {
            Color color = Color.valueOf("GREEN"); // Intentamos acceder a la constante eliminada
            System.out.println("Color seleccionado: " + color);
        } catch (EnumConstantNotPresentException e) {
            System.out.println("¡Se ha producido una EnumConstantNotPresentException!");
            System.out.println("Constante eliminada: " + e.constantName());
            e.printStackTrace();
        }
    }
}
