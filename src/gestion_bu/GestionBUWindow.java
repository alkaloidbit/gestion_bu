package gestion_bu;

import javax.swing.*;
import java.awt.*;

public class GestionBUWindow extends JFrame {
    private JTextField field1;
    private JTextField field2;
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
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.white);

        field1 = new JTextField();
        field1.setColumns(10);

        panel.add(field1);

        field2 = new JTextField();
        field2.setColumns(10);

        panel.add(field2);


        JButton button = new JButton(new GestionBUAction(this, "Calculer"));
        panel.add(button);

        JLabel label = new JLabel("Pas encore de contenu");
        panel.add(label);
        return panel;
    }

    public JTextField getField1() {
        return field1;
    }

    public JTextField getField2() {
        return field2;
    }
}
