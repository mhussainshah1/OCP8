package ocp.ch02.polymorphism;

class Primate {
    public boolean hasHair() {return true;}
}

interface HasTail {
    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public int age = 10;
    @Override
    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        
        HasTail hasTail = lemur;
        System.out.println(hasTail.age); // DOES NOT COMPILE
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
        System.out.println(primate.hasHair());
    }
}
