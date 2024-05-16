package com.kartikkumar.learnspringframework.App1GamingApp.game;

import com.kartikkumar.learnspringframework.App1GamingApp.GamingConsole;

public class PacMan implements GamingConsole {
    @Override
    public void up() {
        System.out.println("pacman jumps");
    }

    @Override
    public void down() {
        System.out.println("pacman downs");

    }

    @Override
    public void left() {
        System.out.println("pacman left");

    }

    @Override
    public void right() {
        System.out.println("pacman right");

    }
}
