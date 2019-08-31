package com.newcircle.stream.pipeline_rules;

import java.util.Arrays;
import java.util.List;

/**
 * Stream can process element sequentially 
 * Streams can process elements in parallel 
 * Therefore stream operations are not allowed to modify the stream
 * source while processing on stream
 * 
 * 
 * Stateful Intermediate Operations - need to know the history of results
 * produced by previous steps in the pipeline or need to keep track of how many
 * results it have produced or seen
 *
 * - distinct, limit, skip, sorted
 * normally use in multi-threading
 *
 */
public class StatefulIntermediateOperations {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);
        
        //distint element list - element in result list have to seen before an object in a list
        integers.stream()
                .distinct()
                .forEach(System.out::println);//1 2 3 4 5 
        
        //limit upto the first 3 elements in the result
        integers.stream()
                .limit(3)
                .forEach(System.out::println);//1 2 3
        
        //skip 3 elements in list and rest gives in the result
        integers.stream()
                .skip(3)
                .forEach(System.out::println);//4 5 5
        
        //sort
        integers = Arrays.asList(7, 1, 2, 3, 4, 5, 5);
        integers.stream()
                .sorted()
                .forEach(System.out::print);//1 2 3 4 5 5 7
    }
}
