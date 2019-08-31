//Diamonds are No problem
package com.newcircle.lambdas.default_method;

interface C extends A {

    default void other() {
        System.out.println("C");
    }
}

interface D extends A {

    @Override
    default void doSomething() {
        System.out.println("A");
    }
}

public class CDImpl implements C, D {

    public static void main(String[] args) {
        new CDImpl().doSomething();
        /**
         * D - take the one closest in the graph-D is closer than A. - if they
         * are same level then they conflict it then compiler force to overwrite
         * it
         */
    }
}
