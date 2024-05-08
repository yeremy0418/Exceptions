package RuntimeExceptions;

import java.lang.reflect.MalformedParametersException;

import javax.lang.model.type.MirroredTypesException;

public class MirroredTypes {
public static void main(String[] args) {
        try {
            // Simular una excepción relacionada con tipos reflejados
            throw new MirroredTypesException(null);
        } catch (MirroredTypesException e) {
            System.out.println("Error de tipos reflejados: " + e.getMessage());
        }
    }
    }

