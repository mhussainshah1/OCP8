package io.javabrain.unit1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {

        //No Parameter and no return
        Runnable greetingFunction = () -> System.out.println("Hello World!");

        //One Parameter and return
        Function<Integer, Integer> doubleNumberFunction = (Integer a) -> a * 2;
        Function<String, Integer> stringLengthCountFunction = (String s) -> s.length();

        //Two Parameter and return
        BiFunction<Integer, Integer, Integer> addFunction = (Integer a, Integer b) -> a + b;
        BiFunction<Double, Double, Double> safeDivideFunction
                = (a, b) -> {
                    if (b == 0) {
                        return 0.0;
                    }
                    return a / b;
                };
    }
}
