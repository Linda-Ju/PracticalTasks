package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(isEven(number)){
            System.out.println("Number " + number + " is even.");
        }
        if(isOdd(number)) {
            System.out.println("Number " + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
