package io.javabrain.unit1.java7;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting(); //polymorphism
        helloWorldGreeting.perform();
        greeter.greet(helloWorldGreeting);

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Anonymous Hello World!");
            }
        };
        innerClassGreeting.perform();
        greeter.greet(innerClassGreeting);
    }
}
