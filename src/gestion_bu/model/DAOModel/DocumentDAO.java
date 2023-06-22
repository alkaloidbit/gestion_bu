package gestion_bu.model.DAOModel;

import gestion_bu.model.Author;
import gestion_bu.model.DAO;
import gestion_bu.model.Document;

import javax.xml.transform.Result;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocumentDAO extends DAO<Document> {

    private EditionDAO editionDAO;

    private GenreDAO genreDAO;

    @Override
    public Document find(int id) {
        Document document = new Document();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE)
                    .executeQuery("SELECT d.*, e.name as edition, g.name as genre FROM document d" +
                            " LEFT JOIN edition e " +
                            " ON e.id_edition = d.id_edition " +
                            " LEFT JOIN genre g " +
                            " ON g.id_genre = d.id_genre " +
                            "  WHERE d.id_document = " + id);
            ResultSet authorslist = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE)
                    .executeQuery("SELECT  a.* " +
                            "FROM author a INNER JOIN compose c" +
                            " on c.id_author  = a.id_author " +
                            " LEFT JOIN document d on d.id_document = c.id_document " +
                            "WHERE d.id_document = " + id);

            ArrayList<Author> al = new ArrayList<Author>();
            while (authorslist.next()) {
                Author author = new Author(
                        authorslist.getInt("id_author"),
                        authorslist.getString("first_name"),
                        authorslist.getString("last_name"));
                al.add(author);
            }

            editionDAO = new EditionDAO();
            genreDAO = new GenreDAO();

            if (result.first())
                document = new Document(
                        id,
                        result.getString("title"),
                        editionDAO.find(result.getInt("id_edition")),
                        genreDAO.find(result.getInt("id_genre")),
                        result.getInt("pages_nbr"),
                        result.getString("year"),
                        al);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return document;
    }

    @Override
    public Document create(Document obj) {
        try {
            if (obj.getGenre().getId() == 0) {
                GenreDAO genreDAO = new GenreDAO();
                obj.setGenre(genreDAO.create(obj.getGenre()));
            }
            if (obj.getEdition().getId() == 0) {
                EditionDAO editionDAO = new EditionDAO();
                obj.setEdition(editionDAO.create(obj.getGenre()));
            }
        }
    }

    @Override
    public Document update(Document obj) {
        return null;
    }

    @Override
    public void delete(Document obj) {

    }
}
