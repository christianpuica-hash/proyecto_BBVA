
package ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

    public static Connection conectar() {

        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "system",
                "12345678"
            );

            System.out.println("Conectado");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return con;
    }

}
