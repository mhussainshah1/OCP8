package ocp.ch02.polymorphism;

class Bird {
}

public class Fish {

    public static void main(String[] args) {
        Fish fish = new Fish();
        //Rule -3
        Bird bird = (Bird) fish; // DOES NOT COMPILE 
    }
}
