package io.javabrain.unit2;

import java.util.function.IntConsumer;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;//effectively final
        
        //previously in java 7
        //final int b =20;
        doProcess(a, new IntConsumer() {
            @Override
            public void accept(int i) {
                b =40;
                System.out.println(i + b);
            }
        });
        //Alternatively, now in java 8
        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, IntConsumer p) {
        p.accept(i);
    }
}
