package gestion_bu.model.DAOModel;

import gestion_bu.model.DAO;
import gestion_bu.model.User;
import gestion_bu.model.PasswordHasher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class UserDAO extends DAO<User> {

    PasswordHasher passwordHasher;
    byte[] salt;
    public UserDAO () {
       this.passwordHasher = new PasswordHasher();
       this.salt = "monsel".getBytes();
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
        String hashedPassword = this.passwordHasher.hashPassword(obj.getPasswd(), this.salt);
        try {
            PreparedStatement prepare = connect
                .prepareStatement("INSERT INTO user (is_admin, first_name, last_name, email, passwd) VALUES(?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS
            );

            prepare.setInt(1, obj.getIs_admin());
            prepare.setString(2, obj.getFirst_name());
            prepare.setString(3, obj.getLast_name());
            prepare.setString(4, obj.getEmail());
            prepare.setString(5, hashedPassword);
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
    public User update(User obj) {
        try {
            this.connect
                .createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                ).executeUpdate(
                    "UPDATE user SET is_admin = '"+obj.getIs_admin()+"', " +
                                    " first_name = '" + obj.getFirst_name() + "', " +
                                    " last_name = '" + obj.getLast_name() + "', " +
                                    " email = '" + obj.getEmail() + "', " +
                                    " passwd = '" + obj.getPasswd() + "'" +
                                " WHERE id_user = " + obj.getId() + ""
                );
                obj = this.find(obj.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void delete(User obj) {
        try {
            this.connect
                .createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
                ).executeUpdate(
                    "DELETE FROM user WHERE id_user = " + obj.getId()
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
