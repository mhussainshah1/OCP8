package com.newcircle.lambdas;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        //Syntax
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //Single line - infer parameter types
        integers.forEach(x -> System.out.println(x));

        //multi line
        integers.forEach(x -> {
            x += 10;
            System.out.println(x);
        });
         
        integers.forEach(x -> {
            int y = x / 2;
            System.out.println(y);
        });       
    }
}
