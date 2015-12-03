package LOGIC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SDK.User;

import GUI.*;
import SDK.ServerConnection;

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

                } else if (message.equals("Wrong username or password")) message.equals(("Error in JSON"));
                {

                }
            }
        }
    }


    private class SnakeMenuActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {

            String actCom = a.getActionCommand();

            if (actCom.equals("Start New Game")) {
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
            screen.show(Screen.SNAKEMENU);
        }
    }

    private class CreateGameActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
    }

    private class DeleteGameActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
        }
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
}
