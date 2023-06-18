package gestion_bu.TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowButtonsAction extends JFrame implements ActionListener {
    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button = new JButton(new HereAction("Click here"));
        panel.add(button);

        JButton button2 = new JButton(new ThereAction("Click there"));
        panel.add(button2);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
