package gestion_bu;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connect = ConnectionMariaDB.getInstance();
        ResultSet  result = connect.createStatement().executeQuery("SELECT * FROM gestion_bu.`user`");

        while (result.next()) {
                System.out.println(String.format("%s %s <%s>",
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("email")));
        }
    }
}
