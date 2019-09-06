package com.newcircle.lambdas.functional_interface;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * can have one only non default method
 *
 * java.util.function has 43 functional interface
 *
 * Consumer<T> ---- void accept(T t) --- take input
 *
 * Supplier<T> ---- T get() --- get output
 *
 * Predicate<T> ---- void boolean test(T t) --- take input Test and return
 * boolean
 *
 * Function<T,R> --- R apply(T t) -- take input and get output
 *
 */
@FunctionalInterface //Functional Interface have one method
public interface FunctionalInterfaces {

    public void doSomething() throws IOException;
    //public String doSomethingElse(); 
}

class TestException {

    public static void main(String[] args) throws IOException {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //Functional Interface 
        Consumer<Integer> consumer = x -> System.out.println(x);
        integers.forEach(consumer);

        //infer Exception
        FunctionalInterfaces products = () -> {
            System.out.println("method with exception");
            throw new IOException();
        };

        products.doSomething();
    }
}
