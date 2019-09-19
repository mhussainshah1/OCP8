package io.javabrain.unit1.java8;

public class Greeter {

    public void greet(Runnable greeting) {
        greeting.run();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        //creating New Class - Implementation inside Class
        Runnable helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        //Creating a Function - Implementation outside class
        Runnable lambdaGreeting = ()
                -> System.out.println("Lambda - Hello world!");
        greeter.greet(lambdaGreeting);

        //inner Ananymous Class - Implementation outside class
        Runnable innerClassGreeting = new Runnable() {
            @Override
            public void run() {
                System.out.println("Ananymous Class - Hello world!");
            }
        };
        greeter.greet(innerClassGreeting);
    }
}
