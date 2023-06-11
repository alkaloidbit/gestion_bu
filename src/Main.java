import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load the JDBC Driver
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Driver loaded");

        Database db = new Database();

        db.connect();

        try(ResultSet user_list = db.select("SELECT  * FROM gestion_bu.`user`")) {
            while (user_list.next()) {
                System.out.println(String.format("%s %s <%s>",
                        user_list.getString("first_name"),
                        user_list.getString("last_name"),
                        user_list.getString("email")));
            }
        }

//        db.createOrUpdateOrDelete("INSERT INTO `genre` (`id_edition`, `name`) VALUES (NULL, \"The expert's voice in open source\")");

        db.disconnect();
    }
}
