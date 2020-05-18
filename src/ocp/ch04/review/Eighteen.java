package ocp.ch04.review;

import java.util.stream.DoubleStream;

public class Eighteen {

    public static void main(String[] args) {
        DoubleStream s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x > 2).count();
    }
}
