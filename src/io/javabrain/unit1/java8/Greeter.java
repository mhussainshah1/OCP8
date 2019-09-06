package io.javabrain.unit1.java8;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        
        //creating New Class - Implementation inside Class
        Greeting helloWorldGreeting = new HelloWorldGreeting();   
        greeter.greet(helloWorldGreeting);
        
        //Creating a Function - Implementation outside class
        Greeting lambdaGreeting =() ->  
                System.out.println("Lambda - Hello world!");
        greeter.greet(lambdaGreeting);      
        
        //inner Ananymous Class - Implementation outside class
        Greeting innerClassGreeting = new Greeting(){
            @Override
            public void perform() {
                System.out.println("Ananymous Class - Hello world!");
            }    
        };
        greeter.greet(innerClassGreeting);         
    }
}