package RuntimeExceptions;

public class IllegalState {
    private boolean playing = false;

    public void play() {
        try {
            if (playing) {
                throw new IllegalStateException("No se puede reproducir mientras ya se está reproduciendo.");
            }
            playing = true;
            System.out.println("Reproduciendo música.");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
