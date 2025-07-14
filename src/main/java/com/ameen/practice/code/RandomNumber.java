package com.ameen.practice.code;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the minimum value: ");
        int min = sc.nextInt();
        System.out.print("Enter the maximum value: ");
        int max = sc.nextInt();

        int randomNumber = random.nextInt(max - min) + min;

        System.out.println("Random number between " + min + " and " + max + " is: " + randomNumber);
        sc.close();
    }
}
