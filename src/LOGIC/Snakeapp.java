package LOGIC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import GUI.Screen;

public class Snakeapp {

    private Screen screen;

        public Snakeapp() {
            screen = new Screen();
            screen.setVisible(true);

}
    public void run() {
        screen.getLogin().actionPerformedLogin(new LoginActionListener());

    }

    private class LoginActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            screen.show(Screen.SNAKEMENU);
        }
    }
}
