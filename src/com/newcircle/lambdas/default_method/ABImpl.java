package com.newcircle.lambdas.default_method;

/**
 * default method conflict
 */
interface A {

    default void doSomething() {
        System.out.println("A");
    }
}

interface B {

    default void doSomething() {
        System.out.println("B");
    }
}

public class ABImpl implements A, B {

    /**
     * Compiler Error: Duplicate default methods named doSomething with
     * parameters () and () are inherited from types B and A
     */

    @Override
    public void doSomething() {
        System.out.println("ABImpl");
        A.super.doSomething();// notice A.super.doSoething()

    }

    public static void main(String[] args) {
        new ABImpl().doSomething();//ABImpl \n A
    }
}
