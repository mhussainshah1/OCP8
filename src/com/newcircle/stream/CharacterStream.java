package com.newcircle.stream;

/**
 * Character Stream Source
 */
public class CharacterStream {
    public static void main(String[] args) {
        long length = "ABC".chars().count();
        System.out.println(length);
    }
}
