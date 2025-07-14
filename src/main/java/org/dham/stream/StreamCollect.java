package org.dham.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Sarah", "Mike", "Sarah", "Paul");

        Set<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toSet());

        System.out.println("Distinct names: " + distinctNames);
    }
}
