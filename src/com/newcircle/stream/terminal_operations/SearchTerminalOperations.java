package com.newcircle.stream.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Search Terminal Operations - return a result as soon as a match is found
 */
public class SearchTerminalOperations {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);

        //Find First then stop. e.g. First file in the directory
        //Optional - if stream is empty then return null. we can use Optionl class to check null. 
        Optional<Integer> result1 = integers.stream().findFirst();
        System.out.println(result1.get());//1

        //Check the stream find anything matches the condition x = 5 or value 5 in the stream
        boolean result2 = integers.stream().anyMatch(x -> x == 5);
        System.out.println(result2);//true

        boolean result3 = integers.stream().allMatch(x -> x > 3);
        System.out.println(result3);//false

        /**
         * findAny() - gives unpredictable result. e.g. if we have multiple
         * threads running in parallel stream. if you have three threads running
         * if the first one produces the result then the next time running
         * different thread might win
         */
        Optional<Integer> result4 = integers.stream().findAny();
        System.out.println(result4.get());//unpredictable result 1
    }
}
