package gestion_bu;

import gestion_bu.model.Author;
import gestion_bu.model.Document;
import gestion_bu.model.User;
import gestion_bu.model.Genre;
import gestion_bu.model.DAO;
import gestion_bu.model.DAOModel.DocumentDAO;
import gestion_bu.model.DAOModel.GenreDAO;
import gestion_bu.model.DAOModel.AuthorDAO;
import gestion_bu.model.DAOModel.EditionDAO;

import gestion_bu.model.DAOModel.UserDAO;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        testDocumentDAO td = new testDocumentDAO();
        td.testCrud();

        // testGenreDAO tg = new testGenreDAO();
        // tg.testCrud();
    }
}
