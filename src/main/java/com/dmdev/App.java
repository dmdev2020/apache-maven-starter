package com.dmdev;

import java.util.function.Supplier;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Supplier<String> s = () -> "Hello World";
        System.out.println(s.get());
    }
}
