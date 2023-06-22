package gestion_bu;

import gestion_bu.model.DAOModel.GenreDAO;
import gestion_bu.model.Genre;

public class testGenreDAO {
    public void testCrud() {
        // Genre find
        GenreDAO genreDAO = new GenreDAO();
        Genre genre = genreDAO.find(1);
        System.out.println(genre);
        // Genre update
        genre.setName("For dummies and more");
        genreDAO.update(genre);
        // Genre create
        Genre genre0 = new Genre();
        genre0.setName("Nouveau genre");

        genreDAO.create(genre0);

    }
}
