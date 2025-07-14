package com.ameen.practice.LocalDateTime;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

public class DurationAndPeriodExample {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        LocalDateTime futureDateTime = currentDateTime.plusDays(5).plusHours(3).plusMinutes(30);
        System.out.println("Future Date and Time (5 days, 3 hours, and 30 minutes later): " + futureDateTime);

        Duration duration = Duration.between(currentDateTime, futureDateTime);
        System.out.println("Duration between Current and Future Date: " + duration.toHours() + " hours");

        LocalDateTime pastDateTime = currentDateTime.minusDays(10).minusHours(2);
        System.out.println("Past Date and Time (10 days and 2 hours ago): " + pastDateTime);

        Period period = Period.between(pastDateTime.toLocalDate(), currentDateTime.toLocalDate());
        System.out.println("Period between Past and Current Date: " + period.getDays() + " days");

        Duration additionalDuration = Duration.ofHours(48);
        LocalDateTime newDateTime = currentDateTime.plus(additionalDuration);
        System.out.println("New Date and Time after adding 48 hours: " + newDateTime);

        Period additionalPeriod = Period.ofWeeks(2);
        LocalDateTime newDateTimeWithPeriod = currentDateTime.plus(additionalPeriod);
        System.out.println("New Date and Time after adding 2 weeks: " + newDateTimeWithPeriod);
    }
}
