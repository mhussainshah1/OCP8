//A hierarchy of default method
package com.newcircle.lambdas.default_method;

interface Test3{
    default void doSomething() {
        System.out.println("Test3");
    }
}

interface TestA extends Test3{
    @Override
    default void doSomething() {
        System.out.println("TestA");
    }
}

public class TestImpl3 implements TestA{
    public static void main(String[] args) {
        TestImpl3 testImpl = new TestImpl3();
        testImpl.doSomething();//TestA - pick the closest one
    }
}
