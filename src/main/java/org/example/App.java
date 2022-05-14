package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person =  applicationContext.getBean("person",Person.class);
        System.out.println(person);
        person.CallYourAnimal();

        Person person1 = applicationContext.getBean("person",Person.class);
        Cat cat = applicationContext.getBean("cat",Cat.class);
        person1.setName("Aibek");
        person1.setAge(22);
        person1.setAnimal(cat);
        System.out.println(person1);
        person1.CallYourAnimal();

    }
}
