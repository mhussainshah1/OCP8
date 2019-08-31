package com.newcircle.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * What is a Stream?
 * source -> pipeline -> terminal operations
 * 
 * 
 * Stream Life-cycle
 * ----------------
 * create -> configuration ->  execute -> clean up
 * 
 * <ul>
 *
 * <li>Streams are a functional programming design pattern for processing
 * sequences of elements sequentially or in a parallel.</li>
 * <li>When examining java programs we always run into code along the following
 * lines</li>
 * -Run a database query get a list of objects -Iterate over the list to compute
 * a single result -Iterate over the list to generate a new data structure
 * another list, map, set or ... etc.
 * <li>Streams are a concept that can be implemented in many programming
 * languages</li>
 *
 * </ul>
 *
 */
public class Stream {
    
    private static List<Order> getOrders() {
        List<Order> list = new ArrayList<>();
        Collections.addAll(list, new Order(Type.ONLINE, 23));
        return list;
    }

    public static void main(String[] args) {
        List<Order> orders = getOrders();
        int totalQuantity = 
                orders.stream()
                .filter(o -> o.getType() == Type.ONLINE)
                .mapToInt(o -> o.getQuantity())
                .sum();
        System.out.println(totalQuantity);
        
        //Alternatively,
        totalQuantity = 0;
        for(Order o: orders){
            if( o.getType() == Type.ONLINE){
                totalQuantity += o.getQuantity();
            }
        }
        System.out.println(totalQuantity);
    }

   
}
