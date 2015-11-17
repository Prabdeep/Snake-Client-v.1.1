package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.Login;

import java.awt.Toolkit;

public class Screen extends JFrame {
    public static final String LOGIN = "Login";
    public static final String SNAKEMENU = "Snakemenu";
    public static final String STARTGAME = "Startgame";
    public static final String CREATEGAME = "Creategame";
    public static final String DELETEGAME = "Deletegame";
    public static final String LOADRESULT = "Loadresult";
    public static final String LOADHIGHSCORES = "Loadhighscores";

    private JPanel contentPane;

    private Login login;
    private SnakeMenu snakemenu;
    private StartGame startgame;
    private CreateGame creategame;
    private DeleteGame deletegame;
    private LoadResult loadresult;
    private LoadHighscores loadhighscores;

    private CardLayout c;

    public Screen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 550);
        contentPane = new JPanel();
        contentPane.setLayout(new CardLayout());
        setContentPane(contentPane);

        login = new Login();
        contentPane.add(login, LOGIN);

        snakemenu = new SnakeMenu();
        contentPane.add(snakemenu, SNAKEMENU);

        startgame = new StartGame();
        contentPane.add(startgame, STARTGAME);

        creategame = new CreateGame();
        contentPane.add(creategame, CREATEGAME);

        deletegame = new DeleteGame();
        contentPane.add(deletegame, DELETEGAME);

        loadresult = new LoadResult();
        contentPane.add(loadresult, LOADRESULT);

        loadhighscores = new LoadHighscores();
        contentPane.add(loadhighscores, LOADHIGHSCORES);


        c = (CardLayout) getContentPane().getLayout();

    }

    public void show(String panel) {
        c.show(contentPane, panel);
    }

    public Login getLogin() {
        return login;
    }

    public SnakeMenu getSnakemenu() {
        return snakemenu;
    }

    public StartGame getStartgame() {
        return startgame;
    }

    public CreateGame getCreategame() {
        return creategame;
    }

    public DeleteGame getDeletegame() {
        return deletegame;
    }

    public LoadResult getLoadresult() {
        return loadresult;
    }

    public LoadHighscores getLoadhighscores() {
        return loadhighscores;
    }

}
