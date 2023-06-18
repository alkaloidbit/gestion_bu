package gestion_bu.TestSwing;

import javax.swing.*;

public class TestJFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TestSimpleWindow win = new TestSimpleWindow();
                win.setVisible(true);
            }
        });
    }
}
