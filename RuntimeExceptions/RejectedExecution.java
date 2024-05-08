package RuntimeExceptions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class RejectedExecution {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con la ejecución rechazada de una tarea
            ExecutorService executor = Executors.newFixedThreadPool(1);
            executor.shutdown(); // Apagar el executor
            executor.execute(() -> System.out.println("Tarea ejecutada")); // Intentar ejecutar una tarea después de apagar el executor
        } catch (RejectedExecutionException e) {
            System.out.println("Error de ejecución rechazada: " + e.getMessage());
        }
    }
}
