package gestion_bu.TestSwing;

import javax.swing.*;
import java.awt.*;

public class WindowInput extends JFrame {

    private JPanel buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField textField = new JTextField();
        textField.setColumns(10);

        panel.add(textField);

        return panel;
    }

}
