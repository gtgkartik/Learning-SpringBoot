package com.kartikkumar.learnspringframework.App3GamingSpringBeans;

import com.kartikkumar.learnspringframework.App3GamingSpringBeans.game.GamingConsole;

public class GameRunner {
    private GamingConsole game ;


  public GameRunner (GamingConsole game){
      this.game = game ;
  }

  public  void run(){
      game.up();
      game.down();
      game.left();
      game.right();
  }
}
