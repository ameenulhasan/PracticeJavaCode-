package com.ameen.practice.Base64EncodingDecoding;

import java.util.Base64;

public class Decoding {
    public static void main(String[] args) {

        String encodedString = "SGVsbG8sIFdvcmxkIQ==";

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println("Base64 Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
    }
}
