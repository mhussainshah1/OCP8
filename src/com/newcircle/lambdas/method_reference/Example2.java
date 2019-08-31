package com.newcircle.lambdas.method_reference;
//Reference a Constructor
/**
 * Constructor methods references are quite handy when working with stream
 */
import java.util.function.Function;

public class Example2 {

    public static void main(String[] args) {
        //Reference A Constructor
        Function<String, Integer> mapper1 = x -> new Integer(x);
        System.out.println(mapper1.apply("11")); //new Integer(11);

        //Type 2
        Function<String, Integer> mapper2 = Integer::new;
        System.out.println(mapper1.apply("11"));//new Integer(11);
    }
}
