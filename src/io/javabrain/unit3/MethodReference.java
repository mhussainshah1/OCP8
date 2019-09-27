package io.javabrain.unit3;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        //static method
        Function<Integer, String> f1 = String::valueOf;
        System.out.println(f1.apply(4));

        //Instance method of specific object
        Consumer<String> c1 = System.out::println;
        c1.accept("world");

        //instance method of passing object
        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("abc"));

        //constructor
        Function<String, Integer> f3 = Integer::new;
        System.out.println(f3.apply("11"));
    }
}
