package org.dham.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeOperations {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        LocalDateTime customDateTime = LocalDateTime.of(2024, 10, 1, 14, 30);
        System.out.println("Custom Date and Time: " + customDateTime);

        LocalDateTime futureDateTime = currentDateTime.plusDays(10).plusHours(4);
        System.out.println("Future Date and Time (10 days and 4 hours later): " + futureDateTime);

        LocalDateTime pastDateTime = currentDateTime.minusWeeks(3).minusHours(2);
        System.out.println("Past Date and Time (3 weeks and 2 hours ago): " + pastDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Current Date and Time: " + formattedDateTime);

        int day = currentDateTime.getDayOfMonth();
        int month = currentDateTime.getMonthValue();
        int year = currentDateTime.getYear();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();

        System.out.println("Extracted Components:");
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}
