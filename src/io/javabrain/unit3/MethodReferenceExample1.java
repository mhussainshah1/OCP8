package io.javabrain.unit3;

//Static Method
import java.util.function.Consumer;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printMessage()); //() -> method()
        //MethodReferenceExample1::printMessage === ()-> printMessage()
        t1.start();

        Thread t2 = new Thread(MethodReferenceExample1::printMessage);//static
        t2.start();

        MethodReferenceExample1 object = new MethodReferenceExample1();
        Runnable instanceReference = object::doProcess;

        Consumer<MethodReferenceExample1> ref = MethodReferenceExample1::doProcess;
        ref.accept(new MethodReferenceExample1());

    }

    private static void printMessage() {
        System.out.println("Hello");
    }

    public void doProcess() {
        System.out.println("Consumer");
    }
}
