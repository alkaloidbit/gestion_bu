package gestion_bu;

import gestion_bu.model.DAOModel.UserDAO;
import gestion_bu.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GestionBUAction extends AbstractAction {
    private GestionBUWindow window;

    public GestionBUAction(GestionBUWindow window, String text) {
        super(text);
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = window.getEmailField().getText();
        String passwd = window.getPasswdField().getText();
        UserDAO userDAO = new UserDAO();

        User user = userDAO.login(email, passwd);
        System.out.println(user.getId());

        //TODO handle authentication errors
        String msg;
        if (user.getId() != 0)
            msg = "YWelcome " + user.getFirst_name()+"\n";
        else
            msg = "Error during authentication. Please verify your credentials";

        window.getLabel().setText(msg);
    }
}
