package LOGIC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import GUI.*;

public class Snakeapp {

    private Screen screen;

        public Snakeapp() {
            screen = new Screen();
            screen.setVisible(true);

}
    public void run() {
        screen.getLogin().actionPerformedLogin(new LoginActionListener());
        screen.getSnakemenu().addACList(new SnakeMenuActionListener());
        screen.getStartgame().actionPerformedStartGame(new StartGameActionListener());
        screen.getCreategame().actionPerformedCreateGame(new CreateGameActionListener());
        screen.getDeletegame().actionPerformedDeleteGame(new DeleteGameActionListener());

    // Back ActionListeners

        screen.getStartgame().actionPerformedBack(new StartGameActionListenerBack());
        screen.getCreategame().actionPerformedBack(new CreateGameActionListenerBack());
        screen.getDeletegame().actionPerformedBack(new DeleteGameActionListenerBack());
        screen.getLoadresult().actionPerformedBack(new LoadResultActionListenerBack());
        screen.getLoadhighscores().actionPerformedBack(new LoadHighscoresActionListenerBack());

    }

    private class LoginActionListener implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            screen.show(Screen.SNAKEMENU);
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
