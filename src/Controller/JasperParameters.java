package controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase gestora de parámetros para reports.
 * @author AaronFM
 */
public class JasperParameters {
    //Directory
    public static final String REPORTS_DIRECTORY = ".\\reports";
    //Parameter names.
    public static final String NAME_SURNMAME = "nameSurname";
    public static final String DNI = "dni";
    public static final String MIN_AGE = "minAge";
    public static final String MAX_AGE = "maxAge";
    public static final String CHAR_VALUE = "charValue";
    public static final String IMG_OK = "imgOk";
    public static final String IMG_KO = "imgKo";
    
    //<editor-fold defaultstate="collapsed" desc="Map declaration and restrictions">
    private static final Map<String, Object> parameters = new HashMap<>();

    private JasperParameters() {
        throw new UnsupportedOperationException(
                "%s cannot be instantiated."
                        .formatted(this.getClass().getSimpleName())
        );
    }

    private static void fillMap() {
        parameters.put(NAME_SURNMAME, "Aaron Manuel Fernandez Mourelle");
    }
    //</editor-fold>

    public static Map<String, Object> getMap() {
        if (parameters.isEmpty()) {
            fillMap();
        }
        return parameters;
    }

}
