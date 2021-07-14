package com.company;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        float simpleInterest;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        float principle = scanner.nextInt();

        System.out.print("Enter the time(month): ");
        float time = scanner.nextInt()*12;

        System.out.print("Enter the rate: ");
        float rate = scanner.nextInt();
        rate /= 100;

        simpleInterest = (principle * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
