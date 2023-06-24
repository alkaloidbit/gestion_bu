package gestion_bu.model.DAOModel;

import gestion_bu.model.DAO;
import gestion_bu.model.Genre;
import gestion_bu.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
    public ArrayList<Genre> findAll() {

        return null;
    }

    @Override
    public Genre create(Genre obj) {
        try {
            PreparedStatement prepare = this.connect
                    .prepareStatement(
                        "INSERT INTO genre (name) VALUES (?)",
                        Statement.RETURN_GENERATED_KEYS
                    );
            prepare.setString(1, obj.getName());
            prepare.executeUpdate();
            ResultSet rs = prepare.getGeneratedKeys();
            if (rs != null && rs.next()) {
                int key = rs.getInt(1);
                obj = this.find(key);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Genre update(Genre obj) {
        try {
            this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeUpdate(
                            "UPDATE genre SET name = '"+ obj.getName() +"' "+
                                                " Where id_genre = " + obj.getId() + ""
                    );
            obj = this.find(obj.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Genre obj) {
        try {
            this.connect
                .createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                ).executeUpdate(
                    "DELETE FROM genre WHERE id_genre = " + obj.getId()
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
