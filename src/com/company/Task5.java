package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want to enter: ");
        int[] numbers = new int[scanner.nextInt()];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 1) {
                count++;
            }
        }
        System.out.println("Number of odd numbers: " + count);
    }
}
