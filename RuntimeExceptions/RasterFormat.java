package RuntimeExceptions;

import java.awt.image.RasterFormatException;

public class RasterFormat {
    public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con un formato de raster incorrecto
            throw new RasterFormatException("Error: formato de raster incorrecto");
        } catch (RasterFormatException e) {
            System.out.println("Error de formato de raster: " + e.getMessage());
        }
    } 
}
