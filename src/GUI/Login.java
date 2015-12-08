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

/**
 * Dette er min GUI klasse for skærmen "Login". Denne klasse indenholder det grafiske design, getters og min actionslistners.
 */

/**
 * Vi benytter her et "extended" JPanel hvilket giver mulighed for et vindue kan indenholde Jcomponents.
 */

public class Login extends JPanel {

    /**
     * Deklarering af lokale variabler!
     */

    private JLabel lblWelcome;
    private JTextField PlayerID;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JLabel lblPleaseEnter;
    private JLabel lblPlayerid;
    private JLabel lblPassword;
    private JLabel loginFailure;

    /**
     * Oprettelse af panelet "Login" der bliver tilføjet alle de forskellige komponenter
     */

    public Login() {

        /**
         * sætter layout til "null" så det istedet kan sættes ud fra størrelsen på Jframet
         */

        setLayout(null);
        //setBounds(100, 100, 450, 550);

        /**
         * Tilføjer label
         */

        lblWelcome = new JLabel("Welcome To The CBS Snake Game");
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblWelcome.setForeground(new Color(0, 0, 102));
        lblWelcome.setBounds(35, 60, 379, 27);
        add(lblWelcome);

        /**
         * Tilføjer textfield
         */

        PlayerID = new JTextField();
        PlayerID.setBounds(135, 204, 189, 38);
        add(PlayerID);
        PlayerID.setColumns(10);

        /**
         * Tilføjer JPasswordfield
         */

        passwordField = new JPasswordField();
        passwordField.setBounds(135, 292, 189, 38);
        add(passwordField);

        /**
         * Tilføjer button
         */

        btnLogin = new JButton("Login");
        btnLogin.setForeground(new Color(0, 0, 102));
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLogin.setBounds(98, 405, 253, 44);
        add(btnLogin);

        /**
         * Tilføjer Jlabel
         */

        lblPleaseEnter = new JLabel("Please enter User ID and Password:");
        lblPleaseEnter.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblPleaseEnter.setBounds(54, 110, 341, 25);
        add(lblPleaseEnter);

        /**
         * Tilføjer Jlabel
         */

        lblPlayerid = new JLabel("PlayerID:");
        lblPlayerid.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPlayerid.setBounds(66, 211, 59, 20);
        add(lblPlayerid);

        /**
         * Tilføjer Jlabel
         */

        lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPassword.setBounds(64, 296, 68, 27);
        add(lblPassword);

        /**
         * Tilføjer Jlabel
         */

        loginFailure = new JLabel("");
        loginFailure.setForeground(new Color(204, 0, 0));
        loginFailure.setBounds(112, 354, 272, 44);
        add(loginFailure);

        /**
         * Tilføjer baggrundsbillede til panelet
         */

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    /**
     * laver en set metode for felterne "PlayerID" og "passwordfield" som kan bruges til at rydde teskten fra dem
     */

    public void clearFields(){
         PlayerID.setText("");
         passwordField.setText("");
     }

    /**
     * Actionlisteners for knappen "Login"
     * @param login
     */
    public void actionPerformedLogin(ActionListener login) {
        btnLogin.addActionListener(login);
    }

    /**
     * Getters for de to tekstfelter som bruges til at hente input data
     * @return
     */

    public JTextField getPlayerID() {
        return PlayerID;
    }

    public JTextField getPasswordfield() {
        return passwordField;
    }
}