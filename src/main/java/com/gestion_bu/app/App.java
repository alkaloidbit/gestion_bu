package com.gestion_bu.app;

import java.sql.*;


/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost", "root", "RvTC6F8D")){
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World'")) {
                    rs.first();
                    System.out.println(rs.getString(1));
                }
            }
        }
    }
}
