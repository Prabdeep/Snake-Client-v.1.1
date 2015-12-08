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

public class Snakeapp {

    private Screen screen;
    private User currentPlayer;
    private ServerConnection serverCon;


        public Snakeapp() {
            screen = new Screen();
            currentPlayer = new User();
            screen.setVisible(true);
            serverCon = new ServerConnection();


}
    public void run() {
        screen.getLogin().actionPerformedLogin(new LoginActionListener());
        screen.getSnakemenu().addACList(new SnakeMenuActionListener());
        screen.getStartgame().actionPerformedStartGame(new StartGameActionListener());
        screen.getCreategame().actionPerformedCreateGame(new CreateGameActionListener());
        screen.getDeletegame().actionPerformedDeleteGame(new DeleteGameActionListener());

    // Back ActionListeners:

        screen.getStartgame().actionPerformedBack(new StartGameActionListenerBack());
        screen.getCreategame().actionPerformedBack(new CreateGameActionListenerBack());
        screen.getDeletegame().actionPerformedBack(new DeleteGameActionListenerBack());
        screen.getLoadresult().actionPerformedBack(new LoadResultActionListenerBack());
        screen.getLoadhighscores().actionPerformedBack(new LoadHighscoresActionListenerBack());

    }

    private class LoginActionListener implements ActionListener {


        public void actionPerformed(ActionEvent a) {

            String actCom = a.getActionCommand();
            if (actCom.equals("Login")) {

                currentPlayer.setUsername(screen.getLogin().getPlayerID().getText());
                currentPlayer.setPassword(screen.getLogin().getPasswordfield().getText());

                String message = User.userAuthentication(currentPlayer);

                if (message.equals("Login successful")) {
                    screen.getSnakemenu().setUsers(User.getUsers());
                    screen.show(Screen.SNAKEMENU);

                   // String jsondata = serverCon.put("login/",new Gson().toJson(message));
                    //System.out.println(jsondata);


                    String jsondata = serverCon.post(new Gson().toJson(User.getUsers()), "login/");

                    screen.addStatusWindowMessage("Msg: " + jsondata);

                }

               else if (message.equals("Wrong username or password")) message.equals(("Error in JSON"));
                {

                }
            }
        }
    }


    private class SnakeMenuActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {

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

    private class StartGameActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            Game existingGame = new Game();
            Gamer opponent = new Gamer();

            //Set modspiller id samt handlinger
            opponent.setId(currentPlayer.getId());
            opponent.setControls(screen.getStartgame().getTextfield_gameControl().getText().trim());

            //*** Join det eksisterende spil og sæt modspiller ***
            existingGame.setGameId(Integer.parseInt(screen.getStartgame().getTextField_gameId().getText().trim()));
            existingGame.setOpponent(opponent);

            //Debug
            //System.out.println("Game ID: " + screen.getStartgame().getTextField_gameId().getText().trim());
            //System.out.println("Controls: " + screen.getStartgame().getTextfield_gameControl().getText().trim());

            //Send Json request om at joine
            String jsonGameData = serverCon.put("games/join",new Gson().toJson(existingGame));
            System.out.println(parseMessage(jsonGameData));
            screen.addStatusWindowMessage("Msg: " + parseMessage(jsonGameData));

            //Start spillet
            String jsondata = serverCon.put("games/start",new Gson().toJson(existingGame));
            System.out.println(jsondata);
            screen.addStatusWindowMessage("Msg: " + jsondata);


        }
    }

    private class CreateGameActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            Game newGame = new Game();
            Gamer host = new Gamer();

            //Sæt spiller handlinger
            host.setId(currentPlayer.getId());
            host.setControls(screen.getCreategame().getTextField_gameControl().getText().trim());

            //Her sætter jeg værdier for spillet
            newGame.setMapSize(300);
            newGame.setHost(host);
            newGame.setName(screen.getCreategame().getTextField_gameName().getText().trim());

            //Debug
            //System.out.println("Controls" + screen.getCreategame().getTextField_gameControl().getText().trim());
            //System.out.println("Name" + screen.getCreategame().getTextField_gameName().getText().trim());

            String jsonGameData = serverCon.post(new Gson().toJson(newGame),"games");
            System.out.println(parseMessage(jsonGameData));

            screen.addStatusWindowMessage("Msg: " + parseMessage(jsonGameData));
        }
    }

    private class DeleteGameActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {

            public boolean deleteGame(int gameId); {

                try {
                    serverCon.delete("games/" + gameId);
                } catch (Exception ex) {}}}
            /*Game deleteGame = new Game();

            deleteGame.getGameId();

            deleteGame.setGameId(Integer.parseInt(screen.getStartgame().getTextField_gameId().getText().trim()));

            String jsonGameData = serverCon.delete("games/");


                screen.addStatusWindowMessage("Msg: " + parseMessage(jsonGameData));*/

    }

    //Back ActionListeners

    private class StartGameActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
    }

    private class CreateGameActionListenerBack implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);

        }
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

    //Parse Json besked
    public String parseMessage(String messageToParse) {
        JSONParser parseJsonMessage = new JSONParser();
        try {
            Object object = parseJsonMessage.parse(messageToParse);
            JSONObject jsonobject = (JSONObject) object;

            messageToParse = (String) jsonobject.get("message");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return messageToParse;
    }
}
