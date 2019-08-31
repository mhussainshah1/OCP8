package com.newcircle.lambdas.variable_capture;

//Capture a local Variable
import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample1 {
    
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
   
        int var =10;//Effective Final: infer it is final if it doesn`t chage inside lambda
        integers.forEach(x->System.out.println( x + var));
    }    
}
