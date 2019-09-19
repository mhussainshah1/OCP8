package io.javabrain.unit3;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Java 7
        for (Person p : people) {
            if (p.getLastName().startsWith("C")) {
                System.out.println(p.getFirstName());
            }
        }

        //Java 8
        //Source - provide elements in the stream
        people.stream()
                //Intermediate operation - single or multiple operations perform on stream
                .filter(p -> p.getLastName().startsWith("C"))
                //                .filter(p->p.getLastName().contains("y"))

                //terminal operation - end condition - what causes the stream to act
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("D"))
                .count();
        System.out.println(count);

        //parallel processing
        count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("D"))
                .count();
        System.out.println(count);

    }

}
