package com.newcircle.lambdas.variable_capture;

//Effectively Final
import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        
        int var = 1;
        integers.forEach(x-> {
//            var++; 
//            var =50;
            //compiler Error: local variables referenced from a lambda expression must be final or effectively final
            System.out.println(x);
        });
    }    
}
