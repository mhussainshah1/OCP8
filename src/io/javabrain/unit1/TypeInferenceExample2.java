package io.javabrain.unit1;

public class TypeInferenceExample2 {
    
    public static void main(String[] args) {
        printLambda(s -> s.length());        
    }
    
    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }
    
    //Function Type
    interface StringLengthLambda{
        int getLength(String s);
    }
}
