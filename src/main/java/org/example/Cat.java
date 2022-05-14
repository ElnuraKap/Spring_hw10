package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class Cat implements Animal {
    private String name;

    private String breed;

    private int age;

    @Override
    public void animalPlus() {
        System.out.println("This method is animalPlus cat ");
    }

    @Override
    public void animalMinus() {
        System.out.println("This method is animalMinus cat ");

    }

    @Override
    public String toString() {
        return "Cat\n" +
                "Cat name :" + name +"\n"+
                "Cat breed :" + breed + "\n"+
                "Cat age :" + age ;
    }
}
