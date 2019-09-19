package ocp.ch02.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Duck {

    public void quack() {
        System.out.println("Quack Quack");
    }
}

public class InvalidLambdas {

    public static void main(String[] args) {
        Consumer<Duck> consumer = (Duck d) -> d.quack();
        BiConsumer<Animal, Duck> function = (Animal a, Duck d) -> d.quack();

        //cant redeclare a different variable
        BiFunction<Integer, Integer, Integer> function1 = (a, b) -> {
            int a = 0;
            return 5;
        };

        //redeclare 
        BiFunction<Integer, Integer, Integer> function2 = (a, b) -> {
            int c = 0;
            return 5;
        };

    }
}
