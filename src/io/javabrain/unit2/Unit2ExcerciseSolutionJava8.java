package io.javabrain.unit2;

//Function Type
//--------------
//Predicate<T> take in a type do test and give boolean
//Consumer take input
//Supplier get output
//Function<T,R> T take in a type, R return another type
import io.javabrain.unit1.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2ExcerciseSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Muhammad", "Shah", 39),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort list by last name
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        //Step 2: Create a method that print all elements in the list
        System.out.println("Printing people");
        performConditionally(people,
                p -> true,
                p -> System.out.println(p));

        //Step 3: Create a method that prints all people that have last name beginning with 'C'
        System.out.println("Printing people with last name beginning with C");
        performConditionally(people,
                p -> p.getLastName().startsWith("C"),
                p -> System.out.println(p));

        System.out.println("Printing people with first name beginning with C");
        performConditionally(people,
                p -> p.getFirstName().startsWith("C"),
                p -> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
