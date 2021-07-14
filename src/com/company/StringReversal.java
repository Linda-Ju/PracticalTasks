package com.company;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String words = scanner.nextLine();
        String reverse = "";

        for (int i = words.length() - 1; i >= 0; i--) {
            reverse += words.charAt(i);
        }
        System.out.println(reverse);
    }
}
