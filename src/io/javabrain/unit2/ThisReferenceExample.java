package io.javabrain.unit2;

import java.util.function.IntConsumer;

public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        //Previously,
        thisReferenceExample.doProcess(10, new IntConsumer() {
            @Override
            public void accept(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "Anonymous inner class";
            }
        });
//        System.out.println(this);//Error: this can't be reference from static method
        
        //now        
        /*        
        thisReferenceExample.doProcess(10, i -> {
        System.out.println("Value of i is" + i);
//        System.out.println(this);//Error:this can't be reference from static method
        });
        */        
        thisReferenceExample.execute();
    }

    public static void doProcess(int i, IntConsumer p) {
        p.accept(i);
    }
    
    
    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);
        });
    }

    @Override
    public String toString() {
        return "This is the main ThisReferenceExample class instance";
    }

}
