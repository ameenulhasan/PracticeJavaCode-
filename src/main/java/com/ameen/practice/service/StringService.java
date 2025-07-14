package com.ameen.practice.service;

public interface StringService {

    String reverseWithBuilder(String input);

    String reverseWithBuffer(String input);

    boolean isPalindrome(String input);

    String appendStrings(String... inputs);

    String comparePerformance();

}
