package Controller;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseConnection {

    private static Connection connection;

    /**
     * Dirección MySQL, usuario y contraseña.
     */
    private static final String DATABASE = "jdbc:mysql://192.168.56.104:3306/BDInformes1";
    private static final String USERNAME = "usuario";
    private static final String PASSWORD = "abc123.";

    /**
     * Patrón singleton: Sólo una instancia de esta clase.
     */

    //Constructor a privado para prohibir instanciar un objeto.
    private DatabaseConnection() {
        throw new UnsupportedOperationException("%s is not expected to be constructed.".formatted(this.getClass().getName()));
    }

    /**
     * Asigna la conexión a MySQL y la devuelve.
     *
     * @return
     * @throws SQLException
     */
    public static Connection getInstance() throws SQLException {
        connection = DriverManager.getConnection(DATABASE, USERNAME, PASSWORD);
        return connection;
    }
}
