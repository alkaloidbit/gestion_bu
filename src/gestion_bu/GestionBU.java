package gestion_bu;

import javax.swing.*;

public class GestionBU {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestionBUWindow win = new GestionBUWindow();
                win.setVisible(true);
            }
        });
    }
}
