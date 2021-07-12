package com.company;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        double[] numbers = new double[scanner.nextInt()];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("average = " + average);
    }
}

