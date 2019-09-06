package com.newcircle.lambdas.variable_capture;

//this within a lambda body
import java.util.Arrays;
import java.util.List;

public class Example1 {

    //Constant variable
    private static final Example1 INSTANCE = new Example1();

    //instance variable (effectively final)
    private int var = 1;
    private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    private void doSomething() {
        integers.forEach(x -> {

            // "this" inside anonomous class points to the anonynmous class.
            // however, "this" inside lambda expression points towards outer 
            // enclosing class.
            System.out.println(x + this.var);
            //or 
//            System.out.println(x + Example1.this.var);//WORKS!!!

            if (this == INSTANCE) {
                System.out.println("Within the lambda body this refers to the outside");
            }
        });
    }

    public static void main(String[] args) {
        INSTANCE.doSomething();
    }
}
