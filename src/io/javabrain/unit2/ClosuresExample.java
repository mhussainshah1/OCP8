package io.javabrain.unit2;

import java.util.function.IntConsumer;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //previously
        doProcess(a, new IntConsumer() {            
            @Override
            public void accept(int i) {
                //b =40;//Error:local variable referenced inside inner class must be effectively final or final
                System.out.println(i + b);
            }          
        });
        //now in java 8
        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, IntConsumer p) {
        p.accept(i);
    }
}