package RuntimeExceptions;

import java.awt.color.ProfileDataException;

public class ProfileData {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con datos de perfil incorrectos
            throw new ProfileDataException("Error: datos de perfil incorrectos");
        } catch (ProfileDataException e) {
            System.out.println("Error de datos de perfil: " + e.getMessage());
        }
    }
}
