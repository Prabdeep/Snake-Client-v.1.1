package SDK;

import java.util.Date;

public class Game {

    private int gameId;
    private int result;
    private int newGame;
    private int endGame;
    private String name;
    private String hostControls;
    private Player host;
    private Player opponent;
    private String opponentControls;
    private int status;
    private Date created;

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setNewGame(int newGame) {
        this.newGame = newGame;
    }

    public void setEndGame(int endGame) {
        this.endGame = endGame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHostControls(String hostControls) {
        this.hostControls = hostControls;
    }

    public void setHost(Player host) {
        this.host = host;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public void setOpponentControls(String opponentControls) {
        this.opponentControls = opponentControls;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}