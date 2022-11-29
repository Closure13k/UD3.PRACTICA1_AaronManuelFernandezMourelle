package Controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections4.bag.HashBag;
import Main.ReportViewer;
import java.sql.Connection;

import static Controller.JasperParameters.REPORTS_DIRECTORY;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/*
Para todos los informes:
    - El interface de usuario es libre.
    - Los informes jrxml generados deben integrarse en la estructura del
    proyecto netbeans entregado. De no estar integrados en alguno de los
    ejercicios la práctica completa se puntuará con 0 puntos.
    - Todos los informes deben contar con los siguientes componentes:
        # Encabezado: contendrá el nombre y apellidos del autor del informe.
        Esta información debe de ser pasada al informe utilizando parámetros.
        # Pie de página: el pie de página mostrará el número de página.
    - En caso de que un informe no contenga información no se mostrara el
    visor de informes sino que se mostrará al usuario un mensaje
    personalizado indicándole que no hay datos que mostrar.
    - El formato del informe debe de ser “amigable” y no simples campos
    situados al azar.
    - Las imágenes utilizadas deben integrarse en la estructura del proyecto
    netbeans entregado. De no estar integradas la práctica completa se
    puntuará con 0 puntos
 */
public final class Reports {

    private static final String NO_DATA = "El informe no tiene datos.";
    private static final ReportViewer REPORT_VIEWER = ReportViewer.getInstance();

    //<editor-fold defaultstate="collapsed" desc="Hidden constructor">
    private Reports() {
        throw new UnsupportedOperationException("Not instantiable");
    }

    //</editor-fold>
    public static void main(String[] args) {
        REPORT_VIEWER.setVisible(true);
    }

    /**
     * Informe ejercicio 1.
     *
     * Informe predefinido. Mostrará: DNI, nombre, ap1, ap2 y edad de todos los
     * registros.
     */
    public static void predefinedFullReport() {
        compileFillAndShowReport("\\ejercicio_1.jrxml");
    }

    /**
     * Informe ejercicio 2.
     *
     * Informe predefinido. Mostrará: ap1 y nombre de todos los menores de edad.
     */
    public static void predefinedUnderagedReport() {

        compileFillAndShowReport("\\ejercicio_2.jrxml");
    }

    /**
     * Informe ejercicio 3.
     *
     * Informe predefinido. Mostrará: ap1, ap2, nombre y en función de si la
     * persona es mayor de edad o no el siguiente texto:
     *
     * MAYOR DE EDAD (si edad >=18) | MENOR DE EDAD (si edad <18)
     */
    public static void predefinedAgeDistributedReport() {
        compileFillAndShowReport("\\ejercicio_3.jrxml");
    }

    /**
     * Informe ejercicio 4.
     *
     * Informe personalizado. Dado un DNI, mostrará: nombre, ap1, ap2 y edad del
     * registro asociado a dicho DNI.
     */
    public static void customFullReport(String dni) {
        JasperParameters.getMap().put(JasperParameters.DNI, dni);
        compileFillAndShowReport("\\ejercicio_4.jrxml");
    }

    /**
     * Informe ejercicio 5.Informe personalizado.Dado un rango de edades
     * mostrará: ap1, nombre y edad de todos los usuarios cuya edad este
     * comprendida en dicho rango.
     *
     * Además para cada uno de los registros mostrados deberá indicar el número
     * de meses que tiene la persona mostrada.
     *
     * @param minAge
     * @param maxAge
     */
    public static void customRangedAgeReport(int minAge, int maxAge) {
        JasperParameters.getMap().put(JasperParameters.MIN_AGE, minAge);
        JasperParameters.getMap().put(JasperParameters.MAX_AGE, maxAge);
        compileFillAndShowReport("\\ejercicio_5.jrxml");
    }

    /**
     * Informe ejercicio 6.Informe personalizado.
     *
     * Dada una única letra que se pedirá al usuario, mostrará: nombre, ap1, ap2
     * y edad de aquellos registros cuyo segundo apellido comience por la letra
     * indicada.
     *
     * @param value
     */
    public static void customSurnameSearchReport(char value) {
        JasperParameters.getMap().put(JasperParameters.CHAR_VALUE, value);
        compileFillAndShowReport("\\ejercicio_6.jrxml");
    }

    /**
     * Informe ejercicio 7.
     *
     * Para cada registro de la base de datos mostrará una línea con el
     * siguiente formato: DNI, nombre, ap1, ap2, edad y una imagen. Dicha imagen
     * será la imagen OK.png en caso de que la persona sea mayor de edad. En
     * caso de que sea menor de edad la imagen a mostrar será la imagen KO.png
     * (las imágenes se adjuntan con la documentación de la práctica).
     */
    public static void customFullAgeReport() {

    }

    public static void compileFillAndShowReport(String route) throws HeadlessException {
        try ( Connection instance = DatabaseConnection.getInstance()) {
            JasperReport compiledReport = JasperCompileManager.compileReport(REPORTS_DIRECTORY.concat(route));
            JasperPrint fillReport = JasperFillManager.fillReport(compiledReport, JasperParameters.getMap(), instance);
            if (fillReport.getPages().isEmpty()) {
                JOptionPane.showMessageDialog(REPORT_VIEWER, NO_DATA);
                return;
            }
            JasperViewer.viewReport(fillReport, false);
        } catch (JRException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}
