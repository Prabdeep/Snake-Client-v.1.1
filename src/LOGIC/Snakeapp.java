package LOGIC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SDK.Game;
import SDK.Gamer;
import SDK.User;

import GUI.*;
import SDK.ServerConnection;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Denne klasse indenholder alt min logik for snake spillet. Klassen er med til at styre GUI og de handlinger der bliver foretaget i spillet.
 * Klassen indenholder samtidigt actionlisteners for hvert panel samt deres funktionalitet.
 * Derudover har klassen til foremål at forbinde backend med frontend.
 */

public class Snakeapp {

    /**
     * Deklarering af lokale variabler!
     */

    private Screen screen;
    private User currentPlayer;
    private ServerConnection serverCon;

    /**
     * Opretter en konstruktør
     */

        public Snakeapp() {
            screen = new Screen();
            currentPlayer = new User();
            screen.setVisible(true);
            serverCon = new ServerConnection();

            /**
             * Metoden "public void run" bliver brugt til at starte programmet fra main klassen
              */
        }
    public void run() {

        /**
         * Tilføjer liste af actionlisteners fra Jpanels
         */

        screen.getLogin().actionPerformedLogin(new LoginActionListener());
        screen.getSnakemenu().addACList(new SnakeMenuActionListener());
        screen.getStartgame().actionPerformedStartGame(new StartGameActionListener());
        screen.getCreategame().actionPerformedCreateGame(new CreateGameActionListener());
        screen.getDeletegame().actionPerformedDeleteGame(new DeleteGameActionListener());

        /**
         * Back ActionListeners:
         */

        screen.getStartgame().actionPerformedBack(new StartGameActionListenerBack());
        screen.getCreategame().actionPerformedBack(new CreateGameActionListenerBack());
        screen.getDeletegame().actionPerformedBack(new DeleteGameActionListenerBack());
        screen.getLoadresult().actionPerformedBack(new LoadResultActionListenerBack());
        screen.getLoadhighscores().actionPerformedBack(new LoadHighscoresActionListenerBack());

    }

    /**
     * Inner klasse "LoginActionListener" bliver brugt til metoden login
     */

    private class LoginActionListener implements ActionListener {

        /**
         * Metoden har til formål at verificere spillere når de trykker på knappen login.
         * @param a
         */

        public void actionPerformed(ActionEvent a) {

            /**
             * actCom tjekker om der er blevet trykket på knappen "Login"
             */

            String actCom = a.getActionCommand();
            if (actCom.equals("Login")) {

                /**
                 * Sætter currentPlayers brugernavn og password samt henter input fra de de felter "PlayerID" og "Passwordfield"
                 */

                currentPlayer.setUsername(screen.getLogin().getPlayerID().getText());
                currentPlayer.setPassword(screen.getLogin().getPasswordfield().getText());

                /**
                 * Tjekker i "SDK.User" om brugeren eksistere.
                 */

                String message = User.userAuthentication(currentPlayer);

                /**
                 * Hvis spilleren bliver verificeret vil man komme videre til "SNAKEMENU"
                 */

                if (message.equals("Login successful")) {
                    screen.getSnakemenu().setUsers(User.getUsers());
                    screen.show(Screen.SNAKEMENU);

                   // String jsondata = serverCon.put("login/",new Gson().toJson(message));
                    //System.out.println(jsondata);

                    /**
                     * Printer response fra server
                     */

                    String jsondata = serverCon.post(new Gson().toJson(User.getUsers()), "login/");

                    screen.addStatusWindowMessage("Msg: " + jsondata);

                }

               else if (message.equals("Wrong username or password")) message.equals(("Error in JSON"));
                {

                }
            }
        }
    }

    /**
     * Inner klasse "SnakeMenuActionListener" bliver brugt til metoden visningen af Snakemenu
     */

    private class SnakeMenuActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {

            /**
             * Klassen sørger for at brugeren bliver sendt til det rigtige Panel
             * når der bliver trykket på en knap.
             */

            String actCom = a.getActionCommand();

            if (actCom.equals("Join Game")) {
                screen.show(screen.STARTGAME);
            }

            else if (actCom.equals("Create Game")){
                screen.show(screen.CREATEGAME);
            }

            else if (actCom.equals("Delete Game")){
                screen.show(screen.DELETEGAME);
            }

            else if (actCom.equals("Load Result From Last Game")){
                screen.show(screen.LOADRESULT);
            }

            else if (actCom.equals("Load Highscores")){
                screen.show(screen.LOADHIGHSCORES);
            }

            else {
                screen.show(screen.LOGIN);
                currentPlayer = new User();
            }
        }
    }

    /**
     * Inner klasse "StartGameActionListener" bliver brugt til at starte et spil
     */

    private class StartGameActionListener implements ActionListener {

        /**
         * Denne klasse har til foremål at starte et spil
         * @param a
         */

        public void actionPerformed(ActionEvent a) {

            /**
             * Opretter et eksiterende spil samt modspiller
             */

            Game existingGame = new Game();
            Gamer opponent = new Gamer();

            /**
             * Setter modspiller id samt handlinger
             */
            opponent.setId(currentPlayer.getId());
            opponent.setControls(screen.getStartgame().getTextfield_gameControl().getText().trim());

            /**
             *  Join det eksisterende spil og sæt modspiller
             */

            existingGame.setGameId(Integer.parseInt(screen.getStartgame().getTextField_gameId().getText().trim()));
            existingGame.setOpponent(opponent);

            //Debug
            //System.out.println("Game ID: " + screen.getStartgame().getTextField_gameId().getText().trim());
            //System.out.println("Controls: " + screen.getStartgame().getTextfield_gameControl().getText().trim());

            /**
             * Sender Json request om at joine spil
             */

            String jsonGameData = serverCon.put("games/join",new Gson().toJson(existingGame));

            /**
             * Udskriver response fra server til status panel
             */

            System.out.println(parseMessage(jsonGameData));
            screen.addStatusWindowMessage("Msg: " + parseMessage(jsonGameData));

            /**
             * Starter spillet
             */

            String jsondata = serverCon.put("games/start",new Gson().toJson(existingGame));

            /**
             * Udskriver response fra server til status panel
             */

            System.out.println(jsondata);
            screen.addStatusWindowMessage("Msg: " + jsondata);
        }
    }

    /**
     * Inner klasse "CreateGameActionListener" bliver brugt til at starte et spil
     */

    private class CreateGameActionListener implements ActionListener {

        /**
         * Denne klasse giver mulighed for at oprette et spil
         * @param a
         */

        public void actionPerformed(ActionEvent a) {

            /**
             * Opretter et nyt spil samt host
             */

            Game newGame = new Game();
            Gamer host = new Gamer();

            /**
             * Setter host spillers  styringshandlinger
             */

            host.setId(currentPlayer.getId());
            host.setControls(screen.getCreategame().getTextField_gameControl().getText().trim());

            /**
             * Setter værdier for spillet
             */

            newGame.setMapSize(300);
            newGame.setHost(host);
            newGame.setName(screen.getCreategame().getTextField_gameName().getText().trim());

            //Debug
            //System.out.println("Controls" + screen.getCreategame().getTextField_gameControl().getText().trim());
            //System.out.println("Name" + screen.getCreategame().getTextField_gameName().getText().trim());

            /**
             * Sender Json request om at oprette spillet
             */

            String jsonGameData = serverCon.post(new Gson().toJson(newGame),"games");

            /**
             * Udskriver response fra server til status panel
             */

            System.out.println(parseMessage(jsonGameData));
            screen.addStatusWindowMessage("Msg: " + parseMessage(jsonGameData));
        }
    }

    /**
     * Inner klasse "DeleteGameActionListener" bliver brugt til at starte et spil
     */

    private class DeleteGameActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {


            /*Game deleteGame = new Game();

            deleteGame.getGameId();

            deleteGame.setGameId(Integer.parseInt(screen.getStartgame().getTextField_gameId().getText().trim()));

            String jsonGameData = serverCon.delete("games/");


                screen.addStatusWindowMessage("Msg: " + parseMessage(jsonGameData));*/
        }
    }

    /**
     * All back buttons ActionListeners
     */

    private class StartGameActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
    }

    private class CreateGameActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {screen.show(Screen.SNAKEMENU);}
    }

    private class DeleteGameActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
    }

    private class LoadResultActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
    }

    private class LoadHighscoresActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
    }

    /**
     * Der er lavet en parse metode som skal bruges hente beskeder fra Json i serveren
     * @param messageToParse
     * @return
     */

    public String parseMessage(String messageToParse) {

        /**
         * Opretter en ny JsonParser metoder
         */

        JSONParser parseJsonMessage = new JSONParser();

        /**
         * Laver en try catch metode
         */

        try {
            Object object = parseJsonMessage.parse(messageToParse);
            JSONObject jsonobject = (JSONObject) object;

            messageToParse = (String) jsonobject.get("message");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        /**
         * Retunere beskeden
         */

        return messageToParse;
    }
}
