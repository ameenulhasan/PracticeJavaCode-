package com.ameen.practice.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class ArbitraryObject {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ameen", "Bob", "Charlie");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
