package RuntimeExceptions;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystemNotFound {
  public static void main(String[] args) {
        // Intentaremos acceder a un archivo que no existe en el sistema de archivos predeterminado
        String filePath = "archivo_que_no_existe.txt";

        try {
            // Intentamos acceder al archivo
            Path path = FileSystems.getDefault().getPath(filePath);
            Files.readAllLines(path);
        } catch (java.nio.file.FileSystemNotFoundException e) {
            // Capturamos la excepción si no se encuentra el sistema de archivos
            System.err.println("No se encontró el sistema de archivos especificado.");
            e.printStackTrace();
        } catch (IOException e) {
            // Otras excepciones de IO
            e.printStackTrace();
        }
    }  
}
