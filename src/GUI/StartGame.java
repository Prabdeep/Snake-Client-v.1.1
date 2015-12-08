package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Dette er min GUI klasse for skærmen "SnakeMenu". Denne klasse indenholder det grafiske design, getters og min actionslistners.
 */

/**
 * Vi benytter her et "extended" JPanel hvilket giver mulighed for et vindue kan indenholde Jcomponents.
 */

public class StartGame extends JPanel {

    /**
     * Deklarering af lokale variabler!
     */

    private JLabel lblStartGame;
    private JLabel lblNameGame;
    private JTextField textField_gameId;
    private JButton btnStartGame;
    private JButton btnBack;
    private JLabel lblGameControls;
    private JTextField textfield_gameControl;
    private JLabel lblGameId;

    /**
     * Getters for de to tekstfelter
     * @return
     */

    public JTextField getTextField_gameId() {
        return textField_gameId;
    }

    public JTextField getTextfield_gameControl() {
        return textfield_gameControl;
    }

    /**
     * Oprettelse af panelet "StartGame" der bliver tilføjet alle de forskellige komponenter
     */

    public StartGame() {

        /**
         * sætter layout til "null" så det istedet kan sættes ud fra størrelsen på Jframet
         */

        setLayout(null);
        //setBounds(100, 100, 450, 550);

        /**
         * Tilføjer jlabel
         */

        lblStartGame = new JLabel("Start Game");
        lblStartGame.setForeground(new Color(0, 0, 102));
        lblStartGame.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblStartGame.setBounds(160, 48, 130, 50);
        add(lblStartGame);

        /**
         * Tilføjer jlabel
         */

        lblNameGame = new JLabel("Please type the name of the game: ");
        lblNameGame.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNameGame.setBounds(65, 95, 319, 50);
        add(lblNameGame);

        /**
         * Tilføjer tekstfelt
         */

        textField_gameId = new JTextField();
        textField_gameId.setBounds(205, 156, 158, 34);
        add(textField_gameId);
        textField_gameId.setColumns(10);

        /**
         * TIlføjer button for startgame
         */

        btnStartGame = new JButton("Start Game");
        btnStartGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnStartGame.setBounds(98, 307, 253, 32);
        add(btnStartGame);

        /**
         * Tilføjer Button
         */

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        /**
         * Tilføjer tekstfield
         */

        textfield_gameControl = new JTextField();
        textfield_gameControl.setBounds(205, 213, 158, 34);
        add(textfield_gameControl);
        textfield_gameControl.setColumns(10);

        /**
         * Tilføjer Jlabel
         */

        lblGameId = new JLabel("Game Id:");
        lblGameId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameId.setBounds(98, 164, 85, 14);
        add(lblGameId);

        /**
         * Tilføjer jlabel
         */

        lblGameControls = new JLabel("Game Controls:");
        lblGameControls.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameControls.setBounds(98, 219, 95, 20);
        add(lblGameControls);

        /**
         * Tilføjer baggrundsbillede til panelet
         */

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    /**
     * Actionlisteners for de to knapper
     * @param startgame
     */

    public void actionPerformedStartGame(ActionListener startgame) {
        btnStartGame.addActionListener(startgame);

    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
