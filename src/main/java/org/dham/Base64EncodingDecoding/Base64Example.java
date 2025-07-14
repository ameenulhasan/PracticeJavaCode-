package org.dham.Base64EncodingDecoding;


import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {

        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);

        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded String (Base64): " + encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String: " + decodedString);
    }
}
