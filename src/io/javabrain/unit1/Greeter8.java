package io.javabrain.unit1;

public class Greeter8 {
    
    public void greet(Greeting greeting){
       greeting.perform();
    }
    
    public static void main(String[] args) {
        Greeter8 greeter = new Greeter8();
        
        Greeting helloWorldGreeting = new HelloWorldGreeting();   
        
        //Java 8
        //functional variable act as object reference. 
        Greeting lambdaGreeting = () -> System.out.println("Lambda Hello World!");
        
        //Java 7
        Greeting innerClassGreeting = new Greeting(){
            @Override
            public void perform(){
                System.out.println("Ananomous Hello World!");
            }
        };
              
       
        helloWorldGreeting.perform();
        //functional variable calling method
        lambdaGreeting.perform();
        innerClassGreeting.perform();
        
        greeter.greet(helloWorldGreeting);
        //functional variable passing through method
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
    }
}
