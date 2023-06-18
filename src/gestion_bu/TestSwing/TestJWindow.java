package gestion_bu.TestSwing;

import javax.swing.*;

public class TestJWindow {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JWindow window = new JWindow();

                window.setSize(300, 200);

                window.setVisible(true);
            }
        });

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) { }

        System.exit(0);
    }
}
