package gestion_bu;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DAO<Author> authorDAO = new AuthorDAO();
        for (int i = 1; i <= 2; i++)
            System.out.println(authorDAO.find(i));

        Author a = new Author();
        a.setFirst_name("Fred");
        a.setLast_name("Badlieutenant");

        authorDAO.create(a);
    }
}