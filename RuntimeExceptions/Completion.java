package RuntimeExceptions;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Completion {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulamos una tarea asíncrona que lanza una excepción
            throw new RuntimeException("Ocurrió un error durante la ejecución de la tarea asíncrona");
        });

        try {
            future.join(); // Esperamos a que la tarea asíncrona termine y obtenemos el resultado
        } catch (CompletionException e) {
            System.out.println("¡Se ha producido una CompletionException!");
            System.out.println("Causa: " + e.getCause().getMessage());
            e.printStackTrace();
        }
    }
}