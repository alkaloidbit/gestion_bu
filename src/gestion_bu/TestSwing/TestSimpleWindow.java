package gestion_bu.TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSimpleWindow extends JFrame  implements ActionListener {

    public TestSimpleWindow() {
        super();
        build();
    }

    private void build() {
        setTitle("My first window");

        setSize(320, 240);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Welcome in my modest application");
        panel.add(label);

        button = new JButton("Click here");
        panel.add(button);

        button2 = new JButton("or there!");
        panel.add(button2);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println(source);
        if (source == button) {
            System.out.println("Vous avez clique ici");
        } else if (source == button2) {
            System.out.println("Vous avez clique la.");
        }
    }

    private JButton button;
    private JButton button2;
}