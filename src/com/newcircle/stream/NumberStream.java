package com.newcircle.stream;

//Number Stream Source
import java.util.stream.LongStream;

/**
 *
 */
public class NumberStream {

    public static void main(String[] args) {
        System.out.println("Long Stream Source");
        LongStream.range(0, 5)
                .forEach(System.out::println);
    }
}
