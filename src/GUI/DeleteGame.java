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
 * Dette er min GUI klasse for skærmen "DeleteGame". Denne klasse indenholder det grafiske design, getters og min actionslistners.
 */

/**
 * Vi benytter her et "extended" JPanel hvilket giver mulighed for et vindue kan indenholde Jcomponents.
 */

public class DeleteGame extends JPanel {

    /**
     * Deklarering af lokale variabler!
     */

    private JLabel lblDeleteAGame;
    private JLabel lblNameGame;
    private JTextField textField;
    private JLabel lblGameName;
    private JButton btnDeleteGame;
    private JButton btnBack;
    private JLabel lblDeleted;
    private JLabel lblGameDeleted;

    /**
     * Getter for tekstfeltet
     * @return
     */

    public JTextField getTextField() {
        return textField;
    }

    /**
     * Oprettelse af panelet "DeleteGame" der bliver tilføjet alle de forskellige komponenter
     */

    public DeleteGame() {

        /**
         * sætter layout til "null" så det istedet kan sættes ud fra størrelsen på Jframet
         */

        setLayout(null);
       // setBounds(100, 100, 450, 550);

        /**
         * Tilføjer JLabel
         */

        lblDeleteAGame = new JLabel("Delete a Game");
        lblDeleteAGame.setForeground(new Color(0, 0, 102));
        lblDeleteAGame.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblDeleteAGame.setBounds(142, 48, 166, 50);
        add(lblDeleteAGame);

        /**
         * Tilføjer Jlabel
         */

        lblNameGame = new JLabel("Please type the name of the game: ");
        lblNameGame.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNameGame.setBounds(65, 109, 319, 50);
        add(lblNameGame);

        /**
         * Tilføjer Jlabel
         */

        lblGameName = new JLabel("Game Name:");
        lblGameName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameName.setBounds(86, 228, 86, 34);
        add(lblGameName);

        /**
         * Tilføjer tekstfield
         */

        textField = new JTextField();
        textField.setBounds(177, 230, 186, 34);
        add(textField);
        textField.setColumns(10);

        /**
         * Tilføjer button
         */

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnDeleteGame.setBounds(86, 301, 277, 34);
        add(btnDeleteGame);

        /**
         * Tilføjer button
         */

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        /**
         * Tilføjer JLabel
         */

        lblDeleted = new JLabel("");
        lblDeleted.setBounds(86, 341, 277, 20);
        add(lblDeleted);

        /**
         * Tilføjer Jlabel
         */

        lblGameDeleted = new JLabel("");
        lblGameDeleted.setBounds(86, 378, 277, 50);
        add(lblGameDeleted);

        /**
         * Tilføjer baggrundsbillede til panelet
         */

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);
    }

    /**
     * Tilføjer actionlisteners for the button "DeleteGame" og "Back"
     * @param deletegame
     */

    public void actionPerformedDeleteGame(ActionListener deletegame) {
        btnDeleteGame.addActionListener(deletegame);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}