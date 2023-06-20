package gestion_bu;

import gestion_bu.model.Author;
import gestion_bu.model.DAOModel.DocumentDAO;
import gestion_bu.model.Document;
import gestion_bu.model.User;
import gestion_bu.model.DAO;
import gestion_bu.model.DAOModel.AuthorDAO;
import gestion_bu.model.DAOModel.UserDAO;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        DAO<Author> authorDAO = new AuthorDAO();
//        for (int i = 1; i <= 2; i++)
//            System.out.println(authorDAO.find(i));
//
//        a.setLast_name("Badlieutenant");
//
//        authorDAO.create(a);
//
//        UserDAO userDAO = new UserDAO();
//
//        for (int i = 1; i <= 2; i++)
//            System.out.println(userDAO.find(i));

//        User user = userDAO.login("fredoudjoudi@gmail.com", "foo");

        DocumentDAO docDAO = new DocumentDAO();
        System.out.println(docDAO.find(3));

//        System.out.println(user);
    }
}