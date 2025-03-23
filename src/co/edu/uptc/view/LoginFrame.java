package co.edu.uptc.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame() {
        super("Login Frame");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
