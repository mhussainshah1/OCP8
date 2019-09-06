package com.newcircle.lambdas.variable_capture;

import java.util.Arrays;
import java.util.List;

/**
 * Variable Capture: ----------------- Lambdas can interact with variables
 * defined outside the body of the lambda using variables outside the body of a
 * lambda expression is called variable capture
 *
 */
public class VaraibleCapture {

    static int k = 1;

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        int var = 10; //effectively final = compiler infer variable as final 
        integers.forEach(x -> System.out.println(x + var));

//        var j = 10;        
//        integers.forEach(x -> {
//            j++;
//            System.out.println(x + j);
//        });
        integers.forEach(x -> System.out.println(x + k));

    }

    /* 
    public static void generatedLambdaFunction(Integer x, final int var){
        //var++;
        System.out.println(x + var);
    }
     */
}
