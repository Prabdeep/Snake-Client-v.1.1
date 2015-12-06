package GUI;

        import SDK.User;

        import javax.swing.ImageIcon;
        import javax.swing.JPanel;
        import javax.swing.JLabel;
        import javax.swing.JButton;

        import java.awt.*;
        import java.awt.event.ActionListener;
        import java.util.ArrayList;

public class SnakeMenu extends JPanel {
    private JLabel lblWelcomeToThe;
    private JLabel lblPleaseChoose;
    private JButton btnStartNewGame;
    private JButton btnCreateGame;
    private JButton btnDeleteGame;
    private JButton btnLoadHighscores;
    private JButton btnloadresult;
    private JButton btnLogOut;

    public SnakeMenu() {

        setBounds(100, 100, 450, 550);
        setLayout(null);

        lblWelcomeToThe = new JLabel("Welcome to the Snake menu");
        lblWelcomeToThe.setForeground(new Color(0, 0, 102));
        lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblWelcomeToThe.setBounds(63, 41, 321, 50);
        this.add(lblWelcomeToThe);

        lblPleaseChoose = new JLabel("Please choose an option:");
        lblPleaseChoose.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblPleaseChoose.setBounds(112, 102, 225, 50);
        this.add(lblPleaseChoose);

        btnStartNewGame = new JButton("Join Game");
        btnStartNewGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnStartNewGame.setBounds(72, 163, 306, 41);
        this.add(btnStartNewGame);

        btnCreateGame = new JButton("Create Game");
        btnCreateGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnCreateGame.setBounds(72, 215, 306, 41);
        this.add(btnCreateGame);

        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnDeleteGame.setBounds(72, 267, 306, 41);
        this.add(btnDeleteGame);

        btnLoadHighscores = new JButton("Load Highscores");
        btnLoadHighscores.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnLoadHighscores.setBounds(72, 371, 306, 41);
        this.add(btnLoadHighscores);

        btnloadresult = new JButton("Load Result From Last Game");
        btnloadresult.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnloadresult.setBounds(72, 319, 305, 41);
        this.add(btnloadresult);

        btnLogOut = new JButton("Log Out");
        btnLogOut.setForeground(new Color(0, 0, 102));
        btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnLogOut.setBounds(86, 448, 277, 41);
        this.add(btnLogOut);

        JLabel cbs = new JLabel(""); Image src = new ImageIcon(this.getClass().getResource("Background1.jpg")).getImage();
        cbs.setIcon( new ImageIcon(src));
        cbs.setBounds(0,0,450,550);
        this.add(cbs);
    }
        public void setUsers(ArrayList<User> users){

    }


    public void addACList(ActionListener ac){
        btnStartNewGame.addActionListener(ac);
        btnCreateGame.addActionListener(ac);
        btnDeleteGame.addActionListener(ac);
        btnloadresult.addActionListener(ac);
        btnLoadHighscores.addActionListener(ac);
        btnLogOut.addActionListener(ac);
    }
}