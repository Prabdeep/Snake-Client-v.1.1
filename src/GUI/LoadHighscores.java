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

// import Data.ModelTabel;

public class LoadHighscores extends JPanel {

    private JLabel lblAllHighscores;
    private JLabel lblGamename;
    private JLabel lblHighscore;
    private JLabel lblID;
    private JTable table;
    private JButton btnBack;

    public LoadHighscores() {
        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblAllHighscores = new JLabel("All times highscores in Snake");
        lblAllHighscores.setForeground(new Color(0, 0, 102));
        lblAllHighscores.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblAllHighscores.setBounds(60, 48, 330, 50);
        add(lblAllHighscores);

        lblGamename = new JLabel("Game names");
        lblGamename.setForeground(new Color(0, 0, 153));
        lblGamename.setFont(new Font("Raleway", Font.PLAIN, 13));
        lblGamename.setBounds(65, 145, 84, 14);
        add(lblGamename);

        lblHighscore = new JLabel("Highscores");
        lblHighscore.setForeground(new Color(0, 0, 153));
        lblHighscore.setFont(new Font("Raleway", Font.PLAIN, 13));
        lblHighscore.setBounds(310, 143, 65, 18);
        add(lblHighscore);

        lblID = new JLabel("Game ID");
        lblID.setFont(new Font("Raleway", Font.PLAIN, 13));
        lblID.setForeground(new Color(0, 0, 153));
        lblID.setBounds(193, 145, 58, 14);
        add(lblID);

        table = new JTable();
        table.setBounds(65, 170, 319, 221);
        add(table);

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    public void actionPerformedLoadHighScores(ActionListener loadhighscores) {
        //btn.addActionListener(loadhighscores);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}