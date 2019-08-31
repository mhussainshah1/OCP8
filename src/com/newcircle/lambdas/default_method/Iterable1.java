package com.newcircle.lambdas.default_method;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public interface Iterable1<T> extends java.lang.Iterable<T> {

    @Override
    Iterator<T> iterator();

    //Java 11
    private int a() {
        return 0;
    }

    @Override
    default void forEach(Consumer<? super T> action) {
        int a =1;// local variable
        Objects.requireNonNull(action); //Check object is not null
        for (T t : this) {
            /**
             * this - we can use "this" inside interface . it calls method
             * define inside interface. Here it is referencing the class
             * implementing interface
             */
            action.accept(t);
        }
    }

    /**
     * Split iterator - design for parallelism. it splits into different pieces
     * or multiple thread.
     */
    @Override
    default Spliterator<T> spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }
}
