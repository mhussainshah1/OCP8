package io.javabrain.unit3;

//Static Method
import java.util.function.Consumer;

public class MethodReferenceExample1 {

    public MethodReferenceExample1() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        //static method
        Thread t1 = new Thread(MethodReferenceExample1::printMessage);//() -> printMessage()
        t1.start();

        //instance method of specific object
        MethodReferenceExample1 object = new MethodReferenceExample1();
        Thread t2 = new Thread(object::doProcess);//() -> object.doProcess()
        t2.start();
        
        //instance method of passing object
        Consumer<MethodReferenceExample1> ref = MethodReferenceExample1::doProcess; //x -> x.doProcess()
        ref.accept(new MethodReferenceExample1());
        
        //constructor
        Thread t3 = new Thread(MethodReferenceExample1::new);//()->new MethodReferenceExample1()
        t3.start();

    }

    private static void printMessage() {
        System.out.println("Hello");
    }

    public void doProcess() {
        System.out.println("Consumer");
    }
}
