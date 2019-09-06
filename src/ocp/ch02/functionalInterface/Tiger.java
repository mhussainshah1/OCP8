package ocp.ch02.functionalInterface;

class Animal {
}

@FunctionalInterface
interface Skip extends Sprint {

    public default int getHopCount(Kangaroo kangaroo) {
        return 10;
    }

    public static void skip(int speed) {
    }
}

public class Tiger implements Sprint {

    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! " + animal.toString());
    }
}
