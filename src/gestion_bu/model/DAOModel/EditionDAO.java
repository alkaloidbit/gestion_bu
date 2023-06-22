package gestion_bu.model.DAOModel;

import gestion_bu.model.DAO;
import gestion_bu.model.Edition;
import gestion_bu.model.Edition;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EditionDAO extends DAO<Edition> {
    @Override
    public Edition find(int id) {
        Edition edition = new Edition();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    )
                    .executeQuery("Select e.* from edition e where e.id_edition = " + id);
            if( result.first())
                edition =new Edition(
                        id,
                        result.getString("name")
                );
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return edition;
    }

    @Override
    public Edition create(Edition obj) {
        try {
            PreparedStatement prepare = this.connect
                    .prepareStatement(
                        "INSERT INTO edition (name) VALUES (?)",
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
    public Edition update(Edition obj) {
        try {
            this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeUpdate(
                            "UPDATE edition SET name = '"+ obj.getName() +"' "+
                                                " Where id_edition = " + obj.getId() + ""
                    );
            obj = this.find(obj.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(Edition obj) {
        try {
            this.connect
                .createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                ).executeUpdate(
                    "DELETE FROM edition WHERE id_edition = " + obj.getId()
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
