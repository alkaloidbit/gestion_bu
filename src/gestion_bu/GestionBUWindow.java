package gestion_bu;

import javax.swing.*;
import java.awt.*;

public class GestionBUWindow extends JFrame {
    private JTextField emailField;
    private JPasswordField passwdField;
    private JLabel label;

    public GestionBUWindow() {
        super();
        build();
    }

    private void build() {
        setTitle("Gestion BU");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();

        // TODO  a better layout
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));
        panel.setBackground(Color.white);

        JLabel emailLabel = new JLabel("Email: ");

        emailField = new JTextField();
        emailField.setColumns(10);

        panel.add(emailLabel);
        panel.add(emailField);

        // TODO how to hide text input (password field)
        JLabel passwdLabel = new JLabel("Password: ");
        passwdField = new JPasswordField();
        passwdField.setColumns(10);

        panel.add(passwdLabel);
        panel.add(passwdField);

        JButton button = new JButton(new GestionBUAction(this, "Login"));
        panel.add(button);

        label = new JLabel("");
        panel.add(label);
        return panel;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getPasswdField() {
        return passwdField;
    }

    public JLabel getLabel() {
        return label;
    }

}
