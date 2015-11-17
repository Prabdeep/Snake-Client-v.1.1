package GUI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

public class Login extends JPanel {
    private JLabel lblWelcome;
    private JTextField PlayerID;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JLabel lblPleaseEnter;
    private JLabel lblPlayerid;
    private JLabel lblPassword;
    private JLabel errorMessage;

    /**
     * Create the panel.
     */
    public Login() {
        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblWelcome = new JLabel("Welcome To The CBS Snake Game");
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblWelcome.setForeground(new Color(0, 0, 102));
        lblWelcome.setBounds(35, 60, 379, 27);
        add(lblWelcome);

        PlayerID = new JTextField();
        PlayerID.setBounds(135, 204, 189, 38);
        add(PlayerID);
        PlayerID.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(135, 292, 189, 38);
        add(passwordField);

        btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(0, 0, 102));
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLogin.setBounds(98, 405, 253, 44);
        add(btnLogin);

        lblPleaseEnter = new JLabel("Please enter Player ID and Password:");
        lblPleaseEnter.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblPleaseEnter.setBounds(54, 110, 341, 25);
        add(lblPleaseEnter);

        lblPlayerid = new JLabel("PlayerID:");
        lblPlayerid.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPlayerid.setBounds(66, 211, 59, 20);
        add(lblPlayerid);

        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPassword.setBounds(64, 296, 68, 27);
        add(lblPassword);

        errorMessage = new JLabel("");
        errorMessage.setForeground(new Color(204, 0, 0));
        errorMessage.setBounds(135, 353, 179, 44);
        add(errorMessage);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }
    public void actionPerformedLogin(ActionListener login) {
        btnLogin.addActionListener(login);
    }
}