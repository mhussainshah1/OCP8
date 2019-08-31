package com.newcircle.stream.terminal_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Generic Terminal Operation - do any kind of processing you want on each
 * stream element
 */
public class GenericTerminalOperation {
    public static void main(String[] args) {
        //forEach
         //Syntax
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //Single line - infer parameter types
        integers.forEach(x -> System.out.println(x));
    }
}
