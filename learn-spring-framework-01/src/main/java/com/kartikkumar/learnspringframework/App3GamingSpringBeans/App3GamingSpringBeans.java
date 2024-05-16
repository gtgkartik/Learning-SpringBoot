package com.kartikkumar.learnspringframework.App3GamingSpringBeans;

import com.kartikkumar.learnspringframework.App3GamingSpringBeans.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3GamingSpringBeans {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
//        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
