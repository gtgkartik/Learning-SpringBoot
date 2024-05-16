package com.kartikkumar.learnspringframework.App2Helloworld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2Helloworld {
    // lanuch spring context


    public static void main(String[] args) {
        //configure the things we want to configure in spring as well like - @Configuration Class
        // we are managing the configuration in the Hello World configuration java class file
            var context  = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

// retriving the beans that are managed by the spring
        System.out.println(context.getBean("person3methodCall"));
        System.out.println(context.getBean(Address.class));

    }
    //now we can retrive the method managed by the spring here


}
