package io.javabrain.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        //pass in lambda into wrapperLambda
        process(someNumbers, key, wrapperLambda((i, k) -> System.out.println(i / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i : someNumbers) {
            biConsumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (i, key) -> {
            try {
                biConsumer.accept(i, key);
            } catch (ArithmeticException e) {
                System.err.println("Exception Caught in wrapper lambda");
            }
        };
    }
}
