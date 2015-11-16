package GUI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateGame extends JPanel {
    private JLabel lblCreateAGame;
    private JLabel lblO;
    private JTextField textField;
    private JLabel lblGameName;
    private JButton btnCreateGame;
    private JButton btnBack;
    private JLabel lblNew;
    private JLabel lblNewGame;


    public CreateGame() {
        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblCreateAGame = new JLabel("Create a Game");
        lblCreateAGame.setForeground(new Color(0, 0, 102));
        lblCreateAGame.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblCreateAGame.setBounds(142, 48, 166, 50);
        add(lblCreateAGame);

        lblO = new JLabel("Please type the name of the game: ");
        lblO.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblO.setBounds(65, 109, 319, 50);
        add(lblO);

        textField = new JTextField();
        textField.setBounds(177, 230, 186, 34);
        add(textField);
        textField.setColumns(10);

        lblGameName = new JLabel("Game Name:");
        lblGameName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameName.setBounds(86, 228, 86, 34);
        add(lblGameName);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnCreateGame.setBounds(86, 301, 277, 34);
        add(btnCreateGame);

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        lblNew = new JLabel("");
        lblNew.setBounds(86, 341, 277, 20);
        add(lblNew);

        lblNewGame = new JLabel("");
        lblNewGame.setBounds(86, 378, 277, 50);
        add(lblNewGame);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }
}
