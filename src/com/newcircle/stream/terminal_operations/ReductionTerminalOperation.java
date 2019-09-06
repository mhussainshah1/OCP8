package com.newcircle.stream.terminal_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Reduction Terminal Operations - return a single result.
 *
 * Nothing happens until the terminal operation is invoked!
 */
public class ReductionTerminalOperation {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //Count
        Long count = integers.stream() //source
                //witout intermediate operation
                .count();//terminal
        System.out.println(count);//5

        //minimum
        Optional<Integer> result;
        result = integers.stream()
                .min((x, y) -> x - y);// .min(Comparator.comparingInt(x -> x));
        System.out.println(result.get());//1

        //maximum
        result = integers.stream()
                .max(Comparator.comparingInt(x -> x));//.max((x, y) -> x - y);
        System.out.println(result.get());//5

        //adding all items
        Integer result1 = integers.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(result1);
    }
}
