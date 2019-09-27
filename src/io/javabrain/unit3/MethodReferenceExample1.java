package io.javabrain.unit3;

//Static Method
import java.util.function.Consumer;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
        //static
        Thread t1 = new Thread(() -> printMessage());        
        t1.start();
        
        //or
        Thread t2 = new Thread(MethodReferenceExample1::printMessage);
        t2.start();

        //MethodReferenceExample1::printMessage === ()-> printMessage()
        
        //instance method of specific object
        MethodReferenceExample1 object = new MethodReferenceExample1();
        Runnable instanceReference = object::doProcess;//

        //instance method of passing object
        Consumer<MethodReferenceExample1> ref = MethodReferenceExample1::doProcess; //x->x.doProcess()
        ref.accept(new MethodReferenceExample1());

    }

    private static void printMessage() {
        System.out.println("Hello");
    }

    public void doProcess() {
        System.out.println("Consumer");
    }
}
