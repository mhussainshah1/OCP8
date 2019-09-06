package ocp.ch02.functionalInterface;

class Kangaroo extends Animal {
}

//Variation of valid interfaces
@FunctionalInterface
interface Sprint {

    public void sprint(Animal animal);
}

@FunctionalInterface
interface Run extends Sprint {
}

@FunctionalInterface
interface SprintFaster extends Sprint {

    public void sprint(Animal animal);
}
