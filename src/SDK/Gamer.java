package SDK;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Prabdeep on 04-12-2015.
 */
public class Gamer extends User {

    private int score;
    private int totalScore;
    private int kills;
    private String controls;
    private boolean winner;

    private static ServerConnection serverCon;

    {

        serverCon = new ServerConnection();

    }

    public String createGame(Game game) {

        String jsonImport = serverCon.post(new Gson().toJson(game),"games");
        return null;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setControls(String controls) {
        this.controls = controls;
    }

    public int getKills() {
        return kills;
    }

    public int getScore() {
        return score;
    }

    public String getControls() {
        return controls;
    }

}