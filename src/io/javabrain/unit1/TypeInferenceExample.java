package io.javabrain.unit1;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();//(String s) -> s.length// (s) -> s.length
        System.out.println(myLambda.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {

        int getLength(String s);
    }
}
