package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to compare: ");
        int[] numbers = new int[scanner.nextInt()];
        int largestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] >= largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largestNumber);
    }
}
