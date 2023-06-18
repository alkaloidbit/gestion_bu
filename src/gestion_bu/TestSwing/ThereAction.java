package gestion_bu.TestSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ThereAction extends AbstractAction {

    public ThereAction(String text) {
        super(text);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("vous avex click la");
    }
}
