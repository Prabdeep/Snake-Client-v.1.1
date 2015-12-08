package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * Dette er min GUI klasse for skærmen "LoadHighscores". Denne klasse indenholder det grafiske design, getters og min actionslistners.
 */

/**
 * Vi benytter her et "extended" JPanel hvilket giver mulighed for et vindue kan indenholde Jcomponents.
 */

public class LoadHighscores extends JPanel {

    /**
     * Deklarering af lokale variabler!
     */

    private JLabel lblAllHighscores;
    private JLabel lblGamename;
    private JLabel lblHighscore;
    private JLabel lblID;
    private JTable table;
    private JButton btnBack;

    /**
     * Oprettelse af panelet "Highscores" der bliver tilføjet alle de forskellige komponenter
     */

    public LoadHighscores() {

        /**
         * sætter layout til "null" så det istedet kan sættes ud fra størrelsen på Jframet
         */

        setLayout(null);
        //setBounds(100, 100, 450, 550);

        /**
         * Tilføjer Jlabel
         */

        lblAllHighscores = new JLabel("All times highscores in Snake");
        lblAllHighscores.setForeground(new Color(0, 0, 102));
        lblAllHighscores.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblAllHighscores.setBounds(60, 48, 330, 50);
        add(lblAllHighscores);

        /**
         * Tilføjer Jlabel
         */

        lblGamename = new JLabel("Game names");
        lblGamename.setForeground(new Color(0, 0, 153));
        lblGamename.setFont(new Font("Raleway", Font.PLAIN, 13));
        lblGamename.setBounds(65, 145, 84, 14);
        add(lblGamename);

        /**
         * Tilføjer Jlabel
         */

        lblHighscore = new JLabel("Highscores");
        lblHighscore.setForeground(new Color(0, 0, 153));
        lblHighscore.setFont(new Font("Raleway", Font.PLAIN, 13));
        lblHighscore.setBounds(310, 143, 65, 18);
        add(lblHighscore);

        /**
         * Tilføjer Jlabel
         */

        lblID = new JLabel("Game ID");
        lblID.setFont(new Font("Raleway", Font.PLAIN, 13));
        lblID.setForeground(new Color(0, 0, 153));
        lblID.setBounds(193, 145, 58, 14);
        add(lblID);

        /**
         * Tilføjer JTable
         */

        table = new JTable();
        table.setBounds(65, 170, 319, 221);
        add(table);

        /**
         * Tilføjer JButton
         */

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        /**
         * Tilføjer baggrundsbillede til
         */

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    /**
     * Tilføjer actionlisteners for the buttons "LoadHighscore" and "Back"
     * @param loadhighscores
     */

    public void actionPerformedLoadHighScores(ActionListener loadhighscores) {
        //btn.addActionListener(loadhighscores);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}