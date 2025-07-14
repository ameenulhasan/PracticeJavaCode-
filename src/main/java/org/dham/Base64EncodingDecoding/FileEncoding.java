package org.dham.Base64EncodingDecoding;

import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileEncoding {
    public static void main(String[] args) {
        try {

            byte[] fileContent = Files.readAllBytes(Paths.get("C:/Users/admin/Desktop/md.txt"));

            String encodedFile = Base64.getEncoder().encodeToString(fileContent);
            System.out.println("Base64 Encoded File Content: " + encodedFile);

            byte[] decodedFile = Base64.getDecoder().decode(encodedFile);
            System.out.println("Decoded File Content: " + new String(decodedFile));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
