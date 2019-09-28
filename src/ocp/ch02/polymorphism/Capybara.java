package ocp.ch02.polymorphism;

class Rodent {
}

public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        /**
         * Rule -4
         * Even when the code compiles without issue, an exception may be thrown 
         * at runtime if the object being cast is not actually an instance of 
         * that class.
         */
        Capybara capybara = (Capybara) rodent;//Throws ClassCastException at runtime

        //use instanceof to avoid runtime exception
        if (rodent instanceof Capybara) {
            Capybara capybara1 = (Capybara) rodent;
        }
    }
}
