package io.javabrain.unit2;

import java.util.function.IntConsumer;
public class ThisInAnonymousClass {

    public void doProcess(int i, IntConsumer p) {
        p.accept(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new IntConsumer() {
            //private variable in Anonymous class
            private int state =10;
            
            @Override
            public void accept(int i) {
                System.out.println("Value of i is " + i );
                System.out.println(this);//Instance of Anonymous Inner Class
            }
            
            //Multiple methods in anonymous class
            @Override
            public String toString() {
                return "Anonymous inner class";
            }
        });
//      System.out.println(this);//"this" can't be reference from static context
    }
}
