package gestion_bu;

import gestion_bu.model.Author;
import gestion_bu.model.User;
import gestion_bu.model.DAO;
import gestion_bu.model.DAOModel.AuthorDAO;
import gestion_bu.model.DAOModel.UserDAO;

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

        DAO<User> userDAO = new UserDAO();
        for (int i = 1; i <= 2; i++)
            System.out.println(userDAO.find(i));

        userDAO.login("fredoudjoudi@gmail.com", "aliboulala");

    }
}