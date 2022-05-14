package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class MyConfig {

    @Bean
    public Animal dog(){
        Dog dog = new Dog();
        dog.setName("Bob");
        dog.setAge(3);
        dog.setBreed("Doberman");
        return dog ;
    }

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Elnura");
        person.setAge(22);
        person.setAnimal(dog());
        return person;
    }

    @Bean
    public Animal cat(){
        Cat cat = new Cat();
        cat.setName("Billy");
        cat.setBreed("Siyams cat");
        cat.setAge(5);
        return  cat;
    }
}

