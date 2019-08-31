package com.newcircle.lambdas.variable_capture;

/**
 *          Lambda                |        Anonymous Inner Classes
 * ----------------------------------------------------------------
 *      Can't have states         |    have states (variables/Objects)
 *      One Method                |    Multiple Methods
 *  "this" points to class object |    "this" point to Anonymous object
 * 
 * Although, the compiler could choose to generate anonymous inner class for 
 * every lambda instance which would not to be very efficient way to do things 
 * but it could.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example {

    //Constant variable
    private static final Example INSTANCE = new Example();
    
    //instance variable (effectively final)
    private int var = 1;
    private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    private void doSomething() {
        integers.forEach(x -> {
            System.out.println(x + this.var); 
            //or 
            //System.out.println(x + Example.this.var)
            if (this == INSTANCE) {
                System.out.println("Within the lambda body this refers to the outside");
            }
        });
    }
    
    // assign to variable, pass it to parameter, return from something    
     private void doSomethingelse() {
        integers.forEach(new Consumer<Integer>() {
            
            // private variable inside Anonymous Class
            private int state = 10;
            @Override
            public void accept(Integer x) {                 
                System.out.println(x + Example.this.var);
                if (Example.this == INSTANCE) {
                    System.out.println("Within the Anonymous class body 'this' "
                            + "refers to the inside, whereas Example.this refers"
                            + " to the outside");
                }
            }
        });
    }

    public static void main(String[] args) {
       INSTANCE.doSomething();
       INSTANCE.doSomethingelse();
    }
}
