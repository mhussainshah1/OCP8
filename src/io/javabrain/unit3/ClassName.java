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

        //Instance Method
        ClassName objectReference = new ClassName();
        Runnable ref2 = objectReference::instanceMethod;//() -> objectReference.instanceMethod();
        ref2.run();

        Consumer<ClassName> ref3 = ClassName::instanceMethod;//x -> objectReference.instanceMethod();
        ref3.accept(objectReference);

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
