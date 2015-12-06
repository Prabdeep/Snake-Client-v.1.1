package GUI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateGame extends JPanel {
    private JLabel lblCreateAGame;
    private JLabel lblO;
    private JTextField textField_gameName;
    private JLabel lblGameName;
    private JButton btnCreateGame;
    private JButton btnBack;
    private JLabel lblNew;
    private JLabel lblNewGame;
    private JLabel lblGameCon;



    private JTextField textField_gameControl;
    private JButton btnA;
    private JButton btnS;
    private JButton btnD;
    private JButton btnW;

    public JTextField getTextField_gameControl() {
        return textField_gameControl;
    }

    public JTextField getTextField_gameName() {
        return textField_gameName;
    }

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

        textField_gameName = new JTextField();
        textField_gameName.setBounds(194, 203, 166, 34);
        add(textField_gameName);
        textField_gameName.setColumns(10);

        lblGameName = new JLabel("Game Name:");
        lblGameName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameName.setBounds(86, 201, 86, 34);
        add(lblGameName);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnCreateGame.setBounds(86, 403, 277, 34);
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

        lblGameCon = new JLabel("Game Controls:");
        lblGameCon.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameCon.setBounds(86, 246, 96, 32);
        add(lblGameCon);

        textField_gameControl = new JTextField();
        textField_gameControl.setBounds(194, 248, 166, 34);
        add(textField_gameControl);
        textField_gameControl.setColumns(10);

        btnA = new JButton("A = Left");
        btnA.setBounds(86, 341, 79, 23);
        add(btnA);

        btnW = new JButton("W = Up");
        btnW.setBounds(175, 313, 89, 23);
        add(btnW);

        btnS = new JButton("S = Down");
        btnS.setBounds(175, 341, 89, 23);
        add(btnS);

        btnD = new JButton("D = Right");
        btnD.setBounds(274, 341, 89, 23);
        add(btnD);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    public void actionPerformedCreateGame(ActionListener creategame) {
        btnCreateGame.addActionListener(creategame);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
