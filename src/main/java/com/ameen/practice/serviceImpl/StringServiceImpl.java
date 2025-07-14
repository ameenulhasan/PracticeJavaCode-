package com.ameen.practice.serviceImpl;

import com.ameen.practice.service.StringService;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {

    @Override
    public String reverseWithBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public String reverseWithBuffer(String input) {
        return new StringBuffer(input).reverse().toString();
    }

    @Override
    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    @Override
    public String appendStrings(String... inputs) {
        StringBuilder sb = new StringBuilder();
        for (String str : inputs) {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override
    public String comparePerformance() {
        long startTime, endTime;
        // String Concatenation
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "test";
        }
        endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        // StringBuilder Concatenation
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("test");
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;
        // StringBuffer Concatenation
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sbf.append("test");
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;
        return "String: " + stringTime + " ns, StringBuilder: " + builderTime + " ns, StringBuffer: " + bufferTime + " ns";
    }

}

