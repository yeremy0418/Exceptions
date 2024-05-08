package RuntimeExceptions;

import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystemAlreadyExists {
   public static void main(String[] args) {
        // Definimos el nombre del sistema de archivos
        String fsName = "miFileSystem";

        // Creamos una instancia de Path para el directorio que queremos crear
        Path directory = FileSystems.getDefault().getPath("/tmp/" + fsName);

        try {
            // Intentamos crear el sistema de archivos
            Files.createDirectory(directory);
            System.out.println("El sistema de archivos ha sido creado con éxito.");
        } catch (FileSystemAlreadyExistsException e) {
            // Capturamos la excepción si el sistema de archivos ya existe
            System.err.println("El sistema de archivos ya existe.");
        } catch (Exception e) {
            // Capturamos otras posibles excepciones
            System.err.println("Ha ocurrido un error al intentar crear el sistema de archivos: " + e.getMessage());
        }
    }
}
