package com.newcircle.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Collection Stream Source any collection can act as stream.
 */
public class CollectionStream {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("toronto", "ottawa", "montreal", "vancouver");
        cities.stream()
                .forEach(System.out::println);
    }
}
