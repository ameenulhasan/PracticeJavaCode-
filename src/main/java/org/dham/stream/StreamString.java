package org.dham.stream;

import java.util.Arrays;
import java.util.List;

public class StreamString {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("jack", "Sara", "vivek", "Ana", "Paul","Ameen");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
