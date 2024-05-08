package RuntimeExceptions;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModification {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Elemento 1");
        myList.add("Elemento 2");
        myList.add("Elemento 3");

        try {
            // Intentamos iterar sobre la lista y modificarla al mismo tiempo
            Iterator<String> iterator = myList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
                myList.add("Elemento Nuevo"); // Esta modificación lanzará una ConcurrentModificationException
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("¡Se ha producido una ConcurrentModificationException!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
