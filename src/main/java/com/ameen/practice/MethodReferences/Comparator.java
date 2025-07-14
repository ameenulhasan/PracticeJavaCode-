package com.ameen.practice.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class StringComparator {

    public int compareByLength(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class Comparator {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("ameen", "banana", "vinoth", "kiwi");

        StringComparator comparator = new StringComparator();

        Collections.sort(words, comparator::compareByLength);

        words.forEach(System.out::println);
    }
}
