package com.ameen.practice.LocalDateTime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AdvancedLocalDateTimeOperations {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);


        LocalDateTime customDateTime = LocalDateTime.of(2024, 10, 1, 14, 30);
        System.out.println("Custom Date and Time: " + customDateTime);


        if (currentDateTime.isAfter(customDateTime)) {
            System.out.println("Current date and time is after the custom date and time.");
        } else if (currentDateTime.isBefore(customDateTime)) {
            System.out.println("Current date and time is before the custom date and time.");
        } else {
            System.out.println("Current date and time is the same as the custom date and time.");
        }


        LocalDateTime specificDate = LocalDateTime.of(2023, 10, 10, 12, 0);
        if (specificDate.isBefore(currentDateTime)) {
            System.out.println("The specific date is in the past.");
        } else {
            System.out.println("The specific date is in the future.");
        }


        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + zonedDateTime);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        String formattedZonedDateTime = zonedDateTime.format(formatter);
        System.out.println("Formatted Current Date and Time in New York: " + formattedZonedDateTime);


        ZonedDateTime convertedZonedDateTime = currentDateTime.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date and Time in Kolkata: " + convertedZonedDateTime);
    }
}

