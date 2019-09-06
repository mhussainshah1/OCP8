package io.javabrain.unit1.java7;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
    }
}
