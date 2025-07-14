package org.dham.MethodReferences;

import java.util.Arrays;
import java.util.List;

class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

public class InstanceMethod {
    public static void main(String[] args) {

        List<String> messages = Arrays.asList("Hello", "World", "Java");

        Printer printer = new Printer();

        messages.forEach(printer::print);
    }
}
