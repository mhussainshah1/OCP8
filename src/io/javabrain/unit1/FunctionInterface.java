package io.javabrain.unit1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        //No Parameter and no return
        Runnable greetingFunction = () -> System.out.println("Hello World!");
        greetingFunction.run();

        //One Parameter and return
        Function<Integer, Integer> doubleNumberFunction = a -> a * 2;
        System.out.println(doubleNumberFunction.apply(4));
        
        Function<String, Integer> stringLengthCountFunction = s -> s.length();
        System.out.println(stringLengthCountFunction.apply("Hello World!"));
        
        //Two Parameter and return
        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;
        System.out.println(addFunction.apply(2, 3));
        
        BiFunction<Double, Double, Double> safeDivideFunction = (a, b) -> {
                                                                if (b == 0) {
                                                                    return 0.0;
                                                                }
                                                                return a / b;
                                                            };
        System.out.println(safeDivideFunction.apply(4.0, 3.0));
    }
}
