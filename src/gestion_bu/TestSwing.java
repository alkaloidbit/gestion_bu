package gestion_bu;

import javax.swing.*;
import java.awt.event.*;


public class TestSwing extends JFrame {

    public TestSwing() {
        super("Universary  Library");

        WindowListener  l = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(1500,750);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame freme = new TestSwing();
    }

}
