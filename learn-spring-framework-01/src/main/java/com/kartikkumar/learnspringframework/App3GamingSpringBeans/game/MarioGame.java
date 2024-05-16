package com.kartikkumar.learnspringframework.App3GamingSpringBeans.game;

import com.kartikkumar.learnspringframework.App1GamingApp.GamingConsole;

public class MarioGame implements GamingConsole {


    @Override
    public void up() {
        System.out.println("mario jumps");
    }

    @Override
    public void down() {
        System.out.println("mario goes down");
    }

    @Override
    public void left() {
        System.out.println("mario goes left");
    }

    @Override
    public void right() {
        System.out.println("mario goes right");
    }
}
