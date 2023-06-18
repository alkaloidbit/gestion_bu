package gestion_bu.TestSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HereAction extends AbstractAction {
    public HereAction(String text) {
        super(text);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Vous avez click ici");
    }
}
