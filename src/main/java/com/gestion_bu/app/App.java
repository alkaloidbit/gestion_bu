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
                // try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World'")) {
                try (ResultSet user_list = stmt.executeQuery("SELECT * FROM gestion_bu.`user`")) {
                    while (user_list.next()) {
                        System.out.println(String.format("%s %s <%s>",
                                user_list.getString("first_name"),
                                user_list.getString("last_name"),
                                user_list.getString("email")));
                    }
                }
            }
        }
    }
}
