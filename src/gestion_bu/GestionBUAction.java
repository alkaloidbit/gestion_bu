package gestion_bu;

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
        String email = window.getField1().getText();
        String passwd = window.getField2().getText();

    }
}
