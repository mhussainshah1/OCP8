package io.javabrain.unit3;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference2 {

    public static void main(String[] args) {
        Function<Integer, String> f1 = String::valueOf;//static method
        System.out.println(f1.apply(4));

        //Instance method with created object
        Consumer<String> c1 = System.out::println;
        c1.accept("world");

        //instance method without creating object
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("abc"));

        Function<String, Integer> f3 = Integer::new;//constructor
        System.out.println(f3.apply("11"));
    }
}
