package com.newcircle.lambdas.default_method;

//Overriding a default method
interface Test2 {

    default void doSomething() {
        System.out.println("Test2");
    }
}

public class TestImpl2 implements Test2 {

    @Override
    public void doSomething() {
        System.out.println("TestImpl2");
    }

    public static void main(String[] args) {
        TestImpl2 testImpl = new TestImpl2();
        testImpl.doSomething();//TestImpl2
    }
}
