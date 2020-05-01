package com.newcircle.lambdas.variable_capture;

//Capture Class Variable
import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample4 {

    private int var = 1;
    private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    private void doSomething() {
        integers.forEach(x -> System.out.println(x + var));
    }

    public static void main(String[] args) {
        new LambdaCaptureExample4().doSomething();
    }
}
