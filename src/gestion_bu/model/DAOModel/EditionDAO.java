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
                    .executeQuery("Select e.* from edition e");
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
        return null;
    }

    @Override
    public Edition update(Edition obj) {
        return null;
    }

    @Override
    public void delete(Edition obj) {

    }
}
