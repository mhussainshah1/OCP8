package com.newcircle.stream.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mutable Reduction Terminal Operations - return a multiple results in a
 * container data structure
 */
public class MutableReductionOperation {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);

        Set<Integer> s = integers.stream()
                .collect(Collectors.toSet());
        // there are many useful methods  toList(), toMap(), groupingBy(), partitioningBy()
        System.out.println(s);//[1, 2, 3, 4, 5]

        Integer[] a = integers.stream().toArray(Integer[]::new);
        Arrays.stream(a).forEach(System.out::println);
    }
}
