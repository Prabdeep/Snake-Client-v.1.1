package MAIN;

import LOGIC.Snakeapp;
import SDK.ServerConnection;

/**
 * Created by Prabdeep on 11-11-2015.
 */
public class Main {
    public static void main(String[] args) {
        Snakeapp x = new Snakeapp();
        x.run();
        ServerConnection sc = new ServerConnection();
        sc.get("users");
    }
}
