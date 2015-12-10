package GUI;


import java.awt.*;
import javax.swing.*;

/**
 * GUI klassen screen består af et Jframe som indenholder alle de andre Jpanels.
 * Denne klasse sørger at det er muligt at se alle de foreskellige Jpanels, samt tilføjer rammen rundt om panelerner.
 */

/**
 * Vi benytter her et "extended" JFrame hvilket danner rammen omkring Jpanels
 */

public class Screen extends JFrame {

    /**
     * Der bliver sat et ID for alle Jpanels
     */

    public static final String LOGIN = "Login";
    public static final String SNAKEMENU = "Snakemenu";
    public static final String STARTGAME = "Startgame";
    public static final String CREATEGAME = "Creategame";
    public static final String DELETEGAME = "Deletegame";
    public static final String LOADHIGHSCORES = "Loadhighscores";

    /**
     * Deklarering af lokale variabler fra de forskellige variabler
     */

    private JPanel contentPane, statusPane;

    private Login login;
    private SnakeMenu snakemenu;
    private StartGame startgame;
    private CreateGame creategame;
    private DeleteGame deletegame;
    private LoadHighscores loadhighscores;

    private JPanel status;
    private JLabel lblStatusMessages;
    private JTextArea textArea;
    private JPanel mainMenu;

    /**
     * Oprettelse af framet "Screen" der tilføjer rammen for Jpanels
     * */

    public Screen() {

        /**
         * Sætter størrelsen for Jframet
         */

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 930, 610);

        /**
         * Tilføjer en contianer
         */
        contentPane = new JPanel();
        setContentPane(contentPane);
        getContentPane().setBackground(new Color(153, 153, 153));
        contentPane.setLayout(null);

        /**
         * Tilføjer attributter for contianeren
         */

        mainMenu = new JPanel();
        mainMenu.setBounds(10, 10, 450, 550);
        contentPane.add(mainMenu); // Tilføj til container
        mainMenu.setLayout(new CardLayout()); // Tilføjer et card layout hvor panelerne ligger oven på hinanden

        /**
         * Tilføjer alle paneler til contianeren
         */

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

        loadhighscores = new LoadHighscores();
        mainMenu.add(loadhighscores, LOADHIGHSCORES);


        /**
         * Opretter et status panel
         */

        status = new JPanel();
        status.setBounds(485, 10, 415, 550);
        status.setBackground(new Color(169, 169, 169));
        contentPane.add(status);
        status.setLayout(null);

        /**
         * Tilføjer et Jlabel
         */

        lblStatusMessages = new JLabel("Status Messages:");
        lblStatusMessages.setForeground(new Color(0, 0, 102));
        lblStatusMessages.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblStatusMessages.setVerticalAlignment(SwingConstants.TOP);
        lblStatusMessages.setBounds(10, 11, 161, 22);
        status.add(lblStatusMessages);

        /**
         * Tilføjer et textarea
         */

        textArea = new JTextArea();
        textArea.setBounds(10, 44, 395, 495);
        textArea.setLineWrap(true);
        textArea.setText("This is a status sidebar that prints messages for the snake game: ");
        status.add(textArea);
        textArea.setEditable(false);

        }
      public void clearFields() {
        textArea.setText("");

    }

    /**
     * "Public void show" metoden muliggøre at sende enkelte paneler (cards) til framet.
     * @param panel
     */

    public void show(String panel) {

        CardLayout cardLayout = (CardLayout) mainMenu.getLayout();
        cardLayout.show(mainMenu, panel);
    }

    /**
     * Det er oprettet getters for alle panelerne så de kan hentes andre steder fra
     * @return
     */

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

    public LoadHighscores getLoadhighscores() {return loadhighscores;}

    public void addStatusWindowMessage(String msg){
        textArea.setText(textArea.getText() + "\n" + msg);
    }
}
