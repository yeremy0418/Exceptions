package RuntimeExceptions;

public class IllegalMonitorState {
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        Thread waitingThread = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("Waiting for notification...");
                    // Espera hasta que se notifique
                    monitor.wait();
                    System.out.println("Received notification!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread notifyingThread = new Thread(() -> {
            // Intenta notificar sin tener el bloqueo del monitor
            try {
                System.out.println("Notifying...");
                monitor.notify();
                System.out.println("Notification sent!");
            } catch (IllegalMonitorStateException e) {
                System.out.println("IllegalMonitorStateException caught: " + e.getMessage());
            }
        });

        waitingThread.start();
        notifyingThread.start();
    }    
}
