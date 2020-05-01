package com.newcircle.lambdas.variable_capture;

import java.io.IOException;

public class Main {

    public static void generatedName(Integer x, final int var) {
        System.out.println(x + var);
    }

    public static void main(String[] args) {
        Test t = () -> {
            try {
                System.out.println("test");
                throw new IOException();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        };
    }
}
