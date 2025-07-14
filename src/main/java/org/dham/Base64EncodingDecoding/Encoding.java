package org.dham.Base64EncodingDecoding;

import java.util.Base64;

public class Encoding {
    public static void main(String[] args) {

        String originalString = "Hello, World!";

        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());

        System.out.println("Original String: " + originalString);
        System.out.println("Base64 Encoded String: " + encodedString);
    }
}
