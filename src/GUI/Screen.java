package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
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
    private JPanel mainPanel;

    private Login login;
    private SnakeMenu snakemenu;
    private StartGame startgame;
    private CreateGame creategame;
    private DeleteGame deletegame;
    private LoadResult loadresult;
    private LoadHighscores loadhighscores;

    private CardLayout cl;

    public Screen() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 465, 585);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(465, 585));
        setContentPane(contentPane);

        cl = new CardLayout();
        mainPanel = new JPanel();
        mainPanel.setLayout(cl);
        login = new Login();
        mainPanel.add(login, LOGIN);

        snakemenu = new SnakeMenu();
        mainPanel.add(snakemenu, SNAKEMENU);

        startgame = new StartGame();
        mainPanel.add(startgame, STARTGAME);

        creategame = new CreateGame();
        mainPanel.add(creategame, CREATEGAME);

        deletegame = new DeleteGame();
        mainPanel.add(deletegame, DELETEGAME);

        loadresult = new LoadResult();
        mainPanel.add(loadresult, LOADRESULT);

        loadhighscores = new LoadHighscores();
        mainPanel.add(loadhighscores, LOADHIGHSCORES);

        contentPane.add(mainPanel, BorderLayout.CENTER);
        cl.show(mainPanel, LOGIN);

    }

    public void show(String panel) {
        cl.show(mainPanel, panel);
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
