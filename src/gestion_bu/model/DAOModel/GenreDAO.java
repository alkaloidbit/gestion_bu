package gestion_bu.model.DAOModel;

import gestion_bu.model.DAO;
import gestion_bu.model.Genre;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreDAO extends DAO<Genre> {


    @Override
    public Genre find(int id) {
        Genre genre = new Genre();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    )
                    .executeQuery("Select g.* from genre g where g.id_genre = "+id);
            if(result.first())
                genre = new Genre(
                        id,
                        result.getString("name")
                );
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return  genre;
    }

    @Override
    public Genre create(Genre obj) {
        return null;
    }

    @Override
    public Genre update(Genre obj) {
        return null;
    }

    @Override
    public void delete(Genre obj) {

    }
}
