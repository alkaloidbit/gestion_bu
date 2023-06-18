package gestion_bu.controller;

import gestion_bu.model.DAOModel.UserDAO;
import gestion_bu.model.User;

public class FrontController {

    private UserDAO userDAO;

    public User getUser(String email, String passwd)
    {
        userDAO = new UserDAO();

        User user = userDAO.login(email, passwd);

        return user;
    }
}
