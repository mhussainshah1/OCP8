package io.javabrain.unit3;
import java.util.function.Consumer;

public class ClassName {

    public ClassName() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        //Static Method
        Runnable ref1 = ClassName::staticMethod;//() -> ClassName.staticMethod();
        ref1.run();

        //Instance Method of specific object
        ClassName objectRef = new ClassName();
        Runnable ref2 = objectRef::instanceMethod;//() -> objectRef.instanceMethod();
        ref2.run();

        //instance method of passing object
        Consumer<ClassName> ref3 = ClassName::instanceMethod;//x -> x.instanceMethod();
        ref3.accept(new ClassName());

        //Constructor
        Runnable ref4 = ClassName::new;//()-> new ClassName();
        ref4.run();
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void instanceMethod() {
        System.out.println("Instance Method");
    }
}
