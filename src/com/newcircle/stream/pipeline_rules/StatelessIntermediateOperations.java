package com.newcircle.stream.pipeline_rules;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stateless Intermediate Operations - don't need to know the history of results
 * from the previous steps in the pipeline or keep track of how many results it
 * have produced or seen 
 * 
 * - filter, map, flatMap, peek
 *
 */
public class StatelessIntermediateOperations {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);

        //list of elements less than 4
        integers.stream()
                .filter(x -> x < 4)
                .forEach(System.out::println);// 1 \n 2 \n 3

        //increament each element by one
        List<Integer> m = integers.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList());
        m.forEach(System.out::println); // 2 \n 3 \n 4 \n 5 \n 6 \n 6

        //Summary Statistic
        IntSummaryStatistics stats = integers.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(stats);
        //IntSummaryStatistics{count=6, sum=20, min=1, average=3.333333, max=5}
    }
}
