package com.newcircle.lambdas.default_method;
//default method inheritance

interface Test1 {

    default void doSomething() {
        System.out.println("Test1");
    }
}

public class TestImpl1 implements Test1 {

    public static void main(String[] args) {
        TestImpl1 testImpl = new TestImpl1();
        testImpl.doSomething();//Test1
    }
}
