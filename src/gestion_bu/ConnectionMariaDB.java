package gestion_bu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMariaDB {

    private static String url = "jdbc:mariadb://localhost/gestion_bu";

    private static String  user = "root";

    private static String  passwd = "RvTC6F8D";

    private static Connection connect;

    public static Connection getInstance() {
        if(connect == null) {
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }
}
