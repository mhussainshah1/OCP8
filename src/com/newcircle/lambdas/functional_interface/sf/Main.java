package com.newcircle.lambdas.functional_interface.sf;

import java.io.IOException;

public class Main {

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
