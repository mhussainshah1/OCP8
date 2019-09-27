package io.javabrain.unit2;

import java.util.function.IntConsumer;

public class ThisInLambda {
    public void doProcess(int i, IntConsumer p) {
        p.accept(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);//Instance of Object being Called
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
//            System.out.println(this);//"this" can't be reference from static context
        });
        thisReferenceExample.execute();
    }
    @Override public String toString() {
        return "This is the class instance";
    }
}
