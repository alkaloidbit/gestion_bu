package gestion_bu;

import gestion_bu.model.Author;
import gestion_bu.model.Document;
import gestion_bu.model.User;
import gestion_bu.model.DAO;
import gestion_bu.model.DAOModel.DocumentDAO;
import gestion_bu.model.DAOModel.GenreDAO;
import gestion_bu.model.DAOModel.AuthorDAO;
import gestion_bu.model.DAOModel.EditionDAO;

import gestion_bu.model.DAOModel.UserDAO;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        DocumentDAO docDAO = new DocumentDAO();
        System.out.println(docDAO.find(1));

        GenreDAO genreDAO = new GenreDAO();
        System.out.println(genreDAO.find(1));
//
        EditionDAO editionDAO = new EditionDAO();
        System.out.println(editionDAO.find(1));
//
//        AuthorDAO authorDAO = new AuthorDAO();
//        Author a = authorDAO.find(3);
//        System.out.println(a);
//        a.setLast_name("Salut");
//        a = authorDAO.update(a);
//        System.out.println(a);
//        authorDAO.delete(a);
//        System.out.println(a);
//
//        a = new Author();
//        a.setFirst_name("John");
//        a.setLast_name("Rambo");
//        a = authorDAO.create(a);
//        System.out.println(a);
    }
}
