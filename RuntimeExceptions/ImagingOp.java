package RuntimeExceptions;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class ImagingOp {
    public static void main(String[] args) {
        try {
            // Intentar leer una imagen que no existe
            File file = new File("imagen.png");
            ImageInputStream stream = ImageIO.createImageInputStream(file);
            ImageReader reader = ImageIO.getImageReaders(stream).next();
            reader.setInput(stream);
            reader.read(0); // Intentar leer la imagen
        } catch (IOException e) {
            System.out.println("Error al leer la imagen: " + e.getMessage());
        }
    }
}
