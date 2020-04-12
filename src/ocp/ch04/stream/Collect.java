package ocp.ch04.stream;

import java.util.TreeSet;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
        
        
    }
}
