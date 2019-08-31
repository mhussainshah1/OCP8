//Instance method references to arbitrary object of a particular type
package com.newcircle.lambdas.method_reference;

import java.util.function.Function;

/**
 *Invoked on an object passed as input to the lambda
 */
public class Example4 {
    public static void main(String[] args) {
        //Reference A Constructor
        Function<String, String> mapper1 = x -> x.toUpperCase();
        System.out.println(mapper1.apply("abc")); //ABC

        //Type 4 : reference specific method
        Function<String,String> mapper2 = String::toUpperCase;
        System.out.println(mapper1.apply("def"));//DEF
    }
}
