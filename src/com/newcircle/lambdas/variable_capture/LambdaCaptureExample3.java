package com.newcircle.lambdas.variable_capture;

//Capture Static Variables

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample3 {
    private static int var = 1;
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.forEach(x->System.out.println( x + var));
    }
}
