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
//        try (ResultSet user_list = stmt.executeQuery("SELECT * FROM  gestion_bu.`user`")) {
//                   while (user_list.next()) {
//                       System.out.println(String.format("%s %s <%s>",
//                               user_list.getString("first_name"),
//                               user_list.getString("last_name"),
//                               user_list.getString("email")));
//                   }
//       }
        // Try to connect
//        try (Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/gestion_bu", "root", "RvTC6F8D")) {
//            try(Statement stmt = connection.createStatement()) {
//               try (ResultSet user_list = stmt.executeQuery("SELECT * FROM  gestion_bu.`user`")) {
//                   while (user_list.next()) {
//                       System.out.println(String.format("%s %s <%s>",
//                               user_list.getString("first_name"),
//                               user_list.getString("last_name"),
//                               user_list.getString("email")));
//                   }
//               }
//
//               try (ResultSet doc_list = stmt.executeQuery("select d.title, d.pages_nbr, d.year, e.name as edition from document d inner join edition e on e.id_edition = d.id_edition;")) {
//                    while (doc_list.next()) {
//                        System.out.println(String.format("%s %s %s <%s>",
//                                doc_list.getString("title"),
//                                doc_list.getString("pages_nbr"),
//                                doc_list.getString("year"),
//                                doc_list.getString("edition")));
//                    }
//                }
//            }
//            connection.close();
//        }
    }
}
