package com.ameen.practice.service;

public interface MultiThreadingService {

    void startThreads();

    void printNumbersAlternately();

    void causeDeadlock();

    int computeSum() throws Exception;

    void producerConsumerExample();

    String reverseStringWithBuilder(String input);

    String reverseStringWithBuffer(String input);

    boolean isPalindrome(String input);

    String appendStrings(String... inputs);

    String comparePerformance();

}
