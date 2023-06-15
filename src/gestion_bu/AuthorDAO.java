package gestion_bu;

import java.sql.ResultSet;
import java.sql.SQLException;

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
        return null;
    }

    @Override
    public Author update(Author obj) {
        return null;
    }

    @Override
    public void delete(Author obj) {

    }
}
