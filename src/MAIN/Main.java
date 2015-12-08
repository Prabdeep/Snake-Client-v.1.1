package MAIN;

import LOGIC.Snakeapp;
import SDK.ServerConnection;

/**
 * Main klassen bruges til at starte hele programmet
 */

public class Main {
    public static void main(String[] args) {
        Snakeapp x = new Snakeapp();
        x.run();
        ServerConnection serverCon = new ServerConnection();
        serverCon.get("users");
    }
}
