package gestion_bu;

import javax.swing.*;
import java.awt.event.*;
public class TestSwingComponent extends JFrame{

    public TestSwingComponent() {
       super ("Universary Library");

       WindowListener l = new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
              System.exit(0);
           }
       };

       addWindowListener(l);

       ImageIcon img = new ImageIcon("tips.gif");
       JButton  button = new JButton("My button", img);

       JPanel panel = new JPanel();
       panel.add(button);
       setContentPane(panel);
       setSize(200,100);

       setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new TestSwingComponent();
    }
}
