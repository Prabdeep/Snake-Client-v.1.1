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

public class StartGame extends JPanel {

    private JLabel lblStartGame;
    private JLabel lblNameGame;
    private JTextField textField;
    private JButton btnStartGame;
    private JButton btnBack;
    private JLabel lblGameControls;
    private JTextField textField_1;
    private JLabel lblGameName;

    public StartGame() {
        setLayout(null);
        setBounds(100, 100, 450, 550);

        lblStartGame = new JLabel("Start Game");
        lblStartGame.setForeground(new Color(0, 0, 102));
        lblStartGame.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblStartGame.setBounds(160, 48, 130, 50);
        add(lblStartGame);

        lblNameGame = new JLabel("Please type the name of the game: ");
        lblNameGame.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNameGame.setBounds(65, 95, 319, 50);
        add(lblNameGame);

        textField = new JTextField();
        textField.setBounds(205, 156, 158, 34);
        add(textField);
        textField.setColumns(10);

        btnStartGame = new JButton("Start Game");
        btnStartGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnStartGame.setBounds(98, 307, 253, 32);
        add(btnStartGame);

        btnBack = new JButton("Back to main menu");
        btnBack.setForeground(new Color(0, 0, 102));
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnBack.setBounds(86, 448, 277, 41);
        add(btnBack);

        textField_1 = new JTextField();
        textField_1.setBounds(205, 213, 158, 34);
        add(textField_1);
        textField_1.setColumns(10);

        lblGameName = new JLabel("Game Name:");
        lblGameName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameName.setBounds(98, 164, 85, 14);
        add(lblGameName);

        lblGameControls = new JLabel("Game Controls:");
        lblGameControls.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGameControls.setBounds(98, 219, 95, 20);
        add(lblGameControls);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        add(cbs);

    }

    public void actionPerformedStartGame(ActionListener startgame) {
        btnStartGame.addActionListener(startgame);
    }

    public void actionPerformedBack(ActionListener back) {
        btnBack.addActionListener(back);
    }
}
