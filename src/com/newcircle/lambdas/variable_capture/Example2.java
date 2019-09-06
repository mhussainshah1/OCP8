package com.newcircle.lambdas.variable_capture;

// "this within a anonymous Inner Class
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example2 {

    //Constant variable
    private static final Example2 INSTANCE = new Example2();

    //instance variable (effectively final)
    private int var = 1;
    private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    private void doSomething() {
        integers.forEach(new Consumer<Integer>() {
            private int state = 10;// Cant have in lambda expression
//            lambda expression is just the body of the signature defined
//            in the functional interface the lambda expression will be assigned to.

//            Cases of lamda
//            assign to variable
//            assigned to as parameter
//            return to something 
            @Override
            public void accept(Integer x) {
                int y = this.state + Example2.this.var + x;
                System.out.println("Anonymous class " + y);
            }
        });
    }

    public static void main(String[] args) {
        INSTANCE.doSomething();
    }
}
