package GUI;

import SDK.User;

        import javax.swing.ImageIcon;
        import javax.swing.JPanel;
        import javax.swing.JLabel;
        import javax.swing.JButton;

        import java.awt.*;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;

/**
 * Dette er min GUI klasse for skærmen "SnakeMenu". Denne klasse indenholder det grafiske design, getters og min actionslistners.
 */

/**
 * Vi benytter her et "extended" JPanel hvilket giver mulighed for et vindue kan indenholde Jcomponents.
 */
public class SnakeMenu extends JPanel {

    /**
     * Deklarering af lokale variabler!
     */

    private JLabel lblWelcomeToThe;
    private JLabel lblPleaseChoose;
    private JButton btnStartNewGame;
    private JButton btnCreateGame;
    private JButton btnDeleteGame;
    private JButton btnLoadHighscores;
    private JButton btnloadresult;
    private JButton btnLogOut;

    /**
     * Oprettelse af panelet "SnakeMenu" der bliver tilføjet alle de forskellige komponenter
     */

    public SnakeMenu() {

        /**
         * sætter layout til "null" så det istedet kan sættes ud fra størrelsen på Jframet
         */

        //setBounds(100, 100, 450, 550);
        setLayout(null);

        /**
         * Tilføjer Jlabel
         */

        lblWelcomeToThe = new JLabel("Welcome to the Snake menu");
        lblWelcomeToThe.setForeground(new Color(0, 0, 102));
        lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblWelcomeToThe.setBounds(63, 41, 321, 50);
        this.add(lblWelcomeToThe);

        /**
         * Tilføjer Jlabel
         */

        lblPleaseChoose = new JLabel("Please choose an option:");
        lblPleaseChoose.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblPleaseChoose.setBounds(112, 102, 225, 50);
        this.add(lblPleaseChoose);

        /**
         * Tilføjer Jbutton
         */

        btnStartNewGame = new JButton("Join Game");
        btnStartNewGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnStartNewGame.setBounds(72, 179, 306, 50);
        this.add(btnStartNewGame);

        /**
         * TIlføjer JButton
         */

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnCreateGame.setBounds(72, 240, 306, 50);
        this.add(btnCreateGame);

        /**
         * Tilføjer Jbutton
         */

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnDeleteGame.setBounds(72, 301, 306, 50);
        this.add(btnDeleteGame);

        /**
         * Tilføjer Jbutton
         */

        btnLoadHighscores = new JButton("Load Highscores");
        btnLoadHighscores.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnLoadHighscores.setBounds(72, 362, 306, 50);
        this.add(btnLoadHighscores);


        /**
         * Tilføjer Jbutton
         */

        btnLogOut = new JButton("Log Out");
        btnLogOut.setForeground(new Color(0, 0, 102));
        btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLogOut.setBounds(86, 448, 277, 41);
        this.add(btnLogOut);

        /**
         * Tilføjer baggrundsbillede til panelet
         */

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        this.add(cbs);
    }

    /**
     * Setter for users
     * @param users
     */
        public void setUsers(ArrayList<User> users){

    }

    /**
     * Opretter actionlisteners for alle knapperne, samt bruger en ac(action command) list
     * @param ac
     */
    public void addACList(ActionListener ac){
        btnStartNewGame.addActionListener(ac);
        btnCreateGame.addActionListener(ac);
        btnDeleteGame.addActionListener(ac);
        btnLoadHighscores.addActionListener(ac);
        btnLogOut.addActionListener(ac);
    }
}