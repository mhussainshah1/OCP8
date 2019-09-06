package io.javabrain.unit1;

public class Greeter7 {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter7 greeter = new Greeter7();

        Greeting helloWorldGreeting = new HelloWorldGreeting(); //polymorphism       
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Ananomous Hello World!");
            }
        };

        helloWorldGreeting.perform();
        innerClassGreeting.perform();

        greeter.greet(helloWorldGreeting);
        greeter.greet(innerClassGreeting);
    }
}
