package ocp.ch02.polymorphism;

class Rodent {
}

public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        //Rule -4
        Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime

        if (rodent instanceof Capybara) {
            Capybara capybara1 = (Capybara) rodent;
        }
    }
}
