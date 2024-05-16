package com.kartikkumar.learnspringframework.App1GamingApp.game;

import com.kartikkumar.learnspringframework.App1GamingApp.GamingConsole;

public class SuperContraGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("super jump");
    }

    @Override
    public void down() {
        System.out.println("super down");

    }

    @Override
    public void left() {
        System.out.println("super left");
    }

    @Override
    public void right() {
        System.out.println("super right");

    }
}
