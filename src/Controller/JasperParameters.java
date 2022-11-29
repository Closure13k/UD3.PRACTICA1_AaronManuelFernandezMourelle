/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.HashMap;
import java.util.Map;

/**
 *
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
