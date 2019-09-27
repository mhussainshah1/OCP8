package io.javabrain.unit3;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodLambda {

    public static void main(String[] args) {
        Function<Integer, String> f1 = x -> String.valueOf(x);//static method
        System.out.println(f1.apply(4));

        var printStream = System.out;//Instance method with created object
        Consumer<String> c1 = p -> printStream.println(p);
        c1.accept("world");

        //instance method without creating object
        Function<String, String> f2 = x -> x.toUpperCase();
        System.out.println(f2.apply("abc"));

        Function<String, Integer> f3 = x -> new Integer(x);//constructor
        System.out.println(f3.apply("11"));
    }
}
