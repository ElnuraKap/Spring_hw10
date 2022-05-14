package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter
public class Dog implements Animal {

    private String name;

    private String breed;

    private int age;

    @Override
    public void animalPlus() {
        System.out.println("This method is animalPlus dog ");
    }

    @Override
    public void animalMinus() {
        System.out.println("This method is animalMinus dog ");
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog \n" +
                "Dog name :" + name + "\n" +
                "Dog breed :" + breed + "\n"+
                "Dog age :" + age ;
    }
}
