package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
public class Person {

    private String name;

    private int age;

    private Animal animal;


    public Person( Animal animal) {
        this.animal = animal;
    }
    public  void CallYourAnimal(){
        animal.animalPlus();
        animal.animalMinus();
    }

    @Override
    public String toString() {
        return "Person " +
                "name:" + name +"\n"+
                "age:" + age +"\n"+
                "animal:" + animal ;
    }
}
