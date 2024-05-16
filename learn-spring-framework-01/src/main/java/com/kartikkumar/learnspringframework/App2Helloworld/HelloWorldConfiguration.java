package com.kartikkumar.learnspringframework.App2Helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
// this is a spring configuration app

record Person(String name, int age, Address address){};
// in the above the person class is accepting Address object !!!
record Address(String firstline, String city){};

@Configuration
public class HelloWorldConfiguration {
    // the things that are managed by spring are called as spring beans

    // @bean is created in the configuration
    @Bean
    public String name(){
    return  "Kartik" ;
}

@Bean
public int age(){
        return 21 ;
}


    // creating custom objects

    @Bean  // remember here pseron() is a bean whereas Person is a object
    public Person person(){
        // person object has been created
        var person = new Person(name(), age(), address()); // here we are calling the methods/beans directly
        return person;
    }


    //using parameters to call the beans/methods
    @Bean
    public Person person3methodCall(String name, int age, @Qualifier("address3")  Address address){
        return new Person(name, age, address);
    }

    @Bean
    @Primary
    public Address address(){
        var address = new Address("default address", "vishakapatnam");
        return address;
    }

    // now in the below object bean we will use other beans as parameter
    @Bean(name= "address2")
    @Qualifier("address2")
    public Address address2(){
        var address = new Address("flat 302 surya residency", "vishakapatnam");
        return address;
    }

    @Bean(name= "address3")
    @Qualifier("address3")
    public Address address3(){
        var address = new Address("address 3", "vishakapatnam");
        return address;
    }
}
