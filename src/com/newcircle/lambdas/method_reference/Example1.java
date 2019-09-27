/**
 * A lambda is a way to define an anonymous function
 * But what if the function that we want to use is already written somewhere else
 * Do i re-write the function just because i want to use it?
 * There should be a way to take an existing function and pass to a place where
 * a lambda could be passed. That's what method reference do.
 *
 * Method references can be used to pass an existing function in place where a
 * lambda is expected
 */
package com.newcircle.lambdas.method_reference;
//Reference a Static Method

import java.util.function.Consumer;

public class Example1 {

    public static void doSomething(Integer i) {
        System.out.println(i);
    }

    public static void doSomething(Integer i, Integer j) {
        System.out.println(i + j);
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer1 = x -> doSomething(x);
        consumer1.accept(1);//1

        //Type 1
        Consumer<Integer> consumer2 = Example1::doSomething;
        consumer2.accept(1);//1
        /**
         * i would like you to take a single method having one parameter
         * accept(T t) of Consumer interface and want to use for the
         * implementation of our method doSomething(Integer i)
         *
         * signature (number of parameter) of the referenced method
         * doSomething(Integer i) must match the signature of functional
         * interface method (accept(T t)) and parameter type must same as
         * functional Interface type
         *
         * if there are overloaded method or constructor then it gonna match the
         * right one
         *
         */
    }
}
