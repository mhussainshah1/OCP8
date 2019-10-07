package ocp.ch02.polymorphism;
class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public int age = 10;

    @Override public boolean isTailStriped() {
        return false;
    }
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.isTailStriped());
        System.out.println(lemur.hasHair());
        
        HasTail hasTail = lemur;//Up Casting
        System.out.println(hasTail.isTailStriped());
        
        Primate primate = lemur;//Up Casting
        System.out.println(primate.hasHair());
    }
}
