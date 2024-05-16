package com.kartikkumar.learnspringframework.App1GamingApp;

import com.kartikkumar.learnspringframework.App1GamingApp.game.PacMan;

public class AppGamingJava {

    public static void main(String[] args) {
        GamingConsole game = new PacMan();

        GameRunner gamerunner = new GameRunner(game);
        gamerunner.run();
    }
}

