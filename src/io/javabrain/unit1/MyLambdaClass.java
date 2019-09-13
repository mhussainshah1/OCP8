package io.javabrain.unit1;

public class MyLambdaClass {

    public static void main(String[] args) {
        FunctionType myLambdaFunction = () -> System.out.println("Hello world!");
        //parameter must match interface method parameter

        AddFunctionType myAddFunction = (int a, int b) -> a + b;
    }
}

interface FunctionType {

    void foo();
}

interface AddFunctionType {

    int add(int x, int y);
}
