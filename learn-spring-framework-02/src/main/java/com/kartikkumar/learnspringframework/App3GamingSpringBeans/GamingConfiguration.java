package com.kartikkumar.learnspringframework.App3GamingSpringBeans;

import com.kartikkumar.learnspringframework.App3GamingSpringBeans.game.GamingConsole;
import com.kartikkumar.learnspringframework.App3GamingSpringBeans.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game =  new PacMan();
        return game;
    }
@Bean
    public GameRunner run(GamingConsole game){
        var rungame = new GameRunner(game);

        return rungame;
    }


}
