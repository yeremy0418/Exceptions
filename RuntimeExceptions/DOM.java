package RuntimeExceptions;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.DOMException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOM {
    public static void main(String[] args) {
        try {
            // Crear un documento XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            // Intentar crear un elemento con un nombre no válido
            String invalidElementName = "123Element"; // Nombre de elemento no válido
            Element invalidElement = document.createElement(invalidElementName);
        } catch (DOMException e) {
            System.out.println("¡Se ha producido una DOMException!");
            System.out.println("Código de error: " + e.code);
            System.out.println("Mensaje de error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido un error diferente: " + e);
        }
    }
}
