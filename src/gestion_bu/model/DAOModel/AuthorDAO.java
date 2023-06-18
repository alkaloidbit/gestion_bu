package gestion_bu.model.DAOModel;

import gestion_bu.model.DAO;
import gestion_bu.model.Author;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthorDAO extends DAO<Author> {


    @Override
    public Author find(int id) {
        Author author = new Author();
        try {
            ResultSet result = this.connect
                                    .createStatement(
                                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                                            ResultSet.CONCUR_UPDATABLE
                                    )
                    .executeQuery("SELECT * FROM author WHERE id_author = " + id);

            if(result.first())
                author = new Author(
                        id,
                        result.getString("first_name"),
                        result.getString("last_name")
                );
        }catch (SQLException e) {
           e.printStackTrace();
        }
        return author;
    }

    @Override
    public Author create(Author obj) {
        try {
            PreparedStatement prepare = this.connect
                    .prepareStatement(
                            "INSERT INTO author (first_name, last_name) VALUES(?, ?)",
                            Statement.RETURN_GENERATED_KEYS
                    );
            prepare.setString(1, obj.getLast_name());
            prepare.setString(2, obj.getFirst_name());

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
    public Author update(Author obj) {
        return null;
    }

    @Override
    public void delete(Author obj) {

    }
}