package io.javabrain.unit3;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodLambda {

    public static void main(String[] args) {
        //static method
        Function<Integer, String> f1 = x -> String.valueOf(x);
        System.out.println(f1.apply(4));

        //Instance method of specific object
        Consumer<String> c1 = p -> System.out.println(p);
        c1.accept("world");

        //instance method of passing object
        Function<String, String> f2 = x -> x.toUpperCase();
        System.out.println(f2.apply("abc"));

        //constructor
        Function<String, Integer> f3 = x -> new Integer(x);
        System.out.println(f3.apply("11"));
    }
}
