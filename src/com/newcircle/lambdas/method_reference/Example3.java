//reference to a specific object instance method
package com.newcircle.lambdas.method_reference;

import java.util.function.Consumer;

/**
 *
 * 
 */
public class Example3 {
    
    public static void main(String[] args) {
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        consumer1.accept(1);//1
        
        //Type 3                      object    ::method
        Consumer<Integer> consumer2 = System.out::println;
        consumer2.accept(1);//1
        //use object reference to invoke method
    }    
}
