package ocp.ch02.functionalInterface;

@FunctionalInterfac
interface Walk {
}

@FunctionalInterfac
interface Dance extends Sprint {

    public void dance(Animal animal);
}

@FunctionalInterfac
public interface Crawl {

    public void crawl();

    public int getCount();
}
