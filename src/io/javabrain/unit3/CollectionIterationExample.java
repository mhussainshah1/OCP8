package io.javabrain.unit3;

import io.javabrain.unit1.Person;
import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        //External Iteration - sequential      
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for in loop");
        for (Person p : people) {
            System.out.println(p);
        }

        //Internal iteration - parallel
        System.out.println("Using lambda for each loop");
        people.forEach(System.out::println);//p -> System.out.println(p)
    }
}
