package com.newcircle.lambdas.functional_interface;

@FunctionalInterface
interface PasswordEncoder {

    public String encode(String password, String salt);
}

class TestClass {
    //Implementation of functional interface methods

    public static PasswordEncoder makeBadEncoder() {
        return (password, salt) -> password.toUpperCase(); // returning object       
    }

    public static void doSomething(PasswordEncoder encoder) {
        String salted = encoder.encode("abc", "123");
        System.out.println(salted);
    }

    public static void main(String[] args) {
        PasswordEncoder encoder = makeBadEncoder();
        doSomething(encoder);

        Object o = makeBadEncoder();
        doSomething((PasswordEncoder) o);
    }
}
