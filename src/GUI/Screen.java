package GUI;


import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame {
    public static final String LOGIN = "Login";
    public static final String SNAKEMENU = "Snakemenu";
    public static final String STARTGAME = "Startgame";
    public static final String CREATEGAME = "Creategame";
    public static final String DELETEGAME = "Deletegame";
    public static final String LOADRESULT = "Loadresult";
    public static final String LOADHIGHSCORES = "Loadhighscores";
    public static final String STATUSWINDOW = "StatusWindow";

    private JPanel contentPane, statusPane;

    private Login login;
    private SnakeMenu snakemenu;
    private StartGame startgame;
    private CreateGame creategame;
    private DeleteGame deletegame;
    private LoadResult loadresult;
    private LoadHighscores loadhighscores;
    private StatusWindow statusWindow;

    private JPanel status;
    private JLabel lblStatusMessages;
    private JTextArea textArea;
    private JPanel mainMenu;

    private CardLayout c;

    public Screen() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 930, 610);

        //Container på side
        contentPane = new JPanel();
        setContentPane(contentPane);
        getContentPane().setBackground(new Color(153, 153, 153));
        contentPane.setLayout(null);

        //Knapper og menu
        mainMenu = new JPanel();
        mainMenu.setBounds(10, 10, 450, 550);
        contentPane.add(mainMenu); // Tilføj til container
        mainMenu.setLayout(new CardLayout());

        login = new Login();
        mainMenu.add(login, LOGIN);

        snakemenu = new SnakeMenu();
        mainMenu.add(snakemenu, SNAKEMENU);

        startgame = new StartGame();
        mainMenu.add(startgame, STARTGAME);

        creategame = new CreateGame();
        mainMenu.add(creategame, CREATEGAME);

        deletegame = new DeleteGame();
        mainMenu.add(deletegame, DELETEGAME);

        loadresult = new LoadResult();
        mainMenu.add(loadresult, LOADRESULT);

        loadhighscores = new LoadHighscores();
        mainMenu.add(loadhighscores, LOADHIGHSCORES);

        statusWindow = new StatusWindow();
        mainMenu.add(statusWindow, STATUSWINDOW);

        //c = (CardLayout) getContentPane().getLayout();


        //Status panel
        status = new JPanel();
        status.setBounds(485, 10, 415, 550);
        status.setBackground(new Color(169, 169, 169));
        contentPane.add(status);
        status.setLayout(null);

        lblStatusMessages = new JLabel("Status Messages:");
        lblStatusMessages.setForeground(new Color(0, 0, 102));
        lblStatusMessages.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblStatusMessages.setVerticalAlignment(SwingConstants.TOP);
        lblStatusMessages.setBounds(10, 11, 161, 22);
        status.add(lblStatusMessages);

        textArea = new JTextArea();
        textArea.setBounds(10, 44, 395, 495);
        textArea.setLineWrap(true);
        textArea.setText("This is a status sidebar that prints messages for the snake game: ");
        status.add(textArea);
        textArea.setEditable(false);

    }

    public void show(String panel) {

        //mainMenu = (CardLayout) getContentPane().getLayout();
        System.out.println("Panel:" + panel);

        CardLayout cardLayout = (CardLayout) mainMenu.getLayout();
        cardLayout.show(mainMenu, panel);
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

    public void addStatusWindowMessage(String msg){
        textArea.setText(textArea.getText() + "\n" + msg);
    }
}
