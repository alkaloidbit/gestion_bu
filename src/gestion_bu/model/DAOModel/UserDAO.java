package gestion_bu.model.DAOModel;

import gestion_bu.model.DAO;
import gestion_bu.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class UserDAO extends DAO<User> {

    public String getMsg() {
        return "Message";
    }

    @Override
    public User find(int id) {
        User user = new User();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    )
                    .executeQuery("SELECT * FROM user WHERE id_user = "+ id);
            if (result.first())
                user = new User(
                        id,
                        result.getInt("is_admin"),
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("email"),
                        result.getString("passwd")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public User login(String email, String passwd) {
        User user = new User();
        try {
           ResultSet result = this.connect
                   .createStatement(
                           ResultSet.TYPE_SCROLL_INSENSITIVE,
                           ResultSet.CONCUR_UPDATABLE
                   )
                   .executeQuery("SELECT * FROM user WHERE email = '" + email + "' AND passwd = '" + passwd + "'");
            if (result.first())
                user = new User(
                        result.getInt("id_user"),
                        result.getInt("is_admin"),
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("email"),
                        result.getString("passwd")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User create(User obj) {
        return null;
    }

    @Override
    public User update(User obj) {
        return null;
    }

    @Override
    public void delete(User obj) {

    }
}
