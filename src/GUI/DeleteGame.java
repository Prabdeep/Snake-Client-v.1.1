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

public class DeleteGame extends JPanel {

    private JLabel lblDeleteAGame;
    private JLabel lblNameGame;
    private JTextField textField;
    private JLabel lblGameName;
    private JButton btnDeleteGame;
    private JButton btnBack;
    private JLabel lblDeleted;
    private JLabel lblGameDeleted;

    public JTextField getTextField() {
        return textField;
    }

    public DeleteGame() {

        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblDeleteAGame = new JLabel("Delete a Game");
        lblDeleteAGame.setForeground(new Color(0, 0, 102));
        lblDeleteAGame.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblDeleteAGame.setBounds(142, 48, 166, 50);
        add(lblDeleteAGame);

        lblNameGame = new JLabel("Please type the name of the game: ");
        lblNameGame.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNameGame.setBounds(65, 109, 319, 50);
        add(lblNameGame);

        lblGameName = new JLabel("Game Name:");
        lblGameName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameName.setBounds(86, 228, 86, 34);
        add(lblGameName);

        textField = new JTextField();
        textField.setBounds(177, 230, 186, 34);
        add(textField);
        textField.setColumns(10);

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnDeleteGame.setBounds(86, 301, 277, 34);
        add(btnDeleteGame);

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        lblDeleted = new JLabel("");
        lblDeleted.setBounds(86, 341, 277, 20);
        add(lblDeleted);

        lblGameDeleted = new JLabel("");
        lblGameDeleted.setBounds(86, 378, 277, 50);
        add(lblGameDeleted);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);
    }

    public void actionPerformedDeleteGame(ActionListener deletegame) {
        btnDeleteGame.addActionListener(deletegame);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}