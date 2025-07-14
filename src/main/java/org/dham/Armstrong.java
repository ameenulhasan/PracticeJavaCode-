package org.dham;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n, result = 0;
        int digits = String.valueOf(n).length();

        while (n != 0) {
            int remainder = n % 10;
            result += Math.pow(remainder, digits);
            n /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
        sc.close();
    }
}
