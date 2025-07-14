package org.dham.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateParsingAndValidation {
    public static void main(String[] args) {

        String dateString = "2024-10-14 15:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try {
            LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
            System.out.println("Parsed Date and Time: " + parsedDateTime);


            if (parsedDateTime.toLocalDate().isLeapYear()) {
                System.out.println(parsedDateTime.getYear() + " is a leap year.");
            } else {
                System.out.println(parsedDateTime.getYear() + " is not a leap year.");
            }

            String formattedDateTime = parsedDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm a"));
            System.out.println("Formatted Date and Time: " + formattedDateTime);

        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        String invalidDateString = "2024-02-30 12:00"; // Invalid date (February 30 does not exist)

        try {
            LocalDateTime invalidParsedDateTime = LocalDateTime.parse(invalidDateString, formatter);
            System.out.println("Parsed Invalid Date and Time: " + invalidParsedDateTime);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing invalid date: " + e.getMessage());
        }
    }
}
