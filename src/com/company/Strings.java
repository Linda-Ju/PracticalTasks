package com.company;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("How many words do you want to enter: ");
//        String[] words = new String[scanner.nextInt()];
//        String sentence = "";
//        for (int i = 0; i < words.length; i++) {
//            System.out.print("Enter a word: ");
//            words[i] = scanner.next();
//            sentence = sentence + " " + words[i];
//        }
//        System.out.println(sentence);




        //2nd solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words do you want to enter: ");

        int numberOfStrings = scanner.nextInt();
        String joiner = "";

        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Add a string");
            joiner += scanner.next() + " ";
        }
        System.out.println(joiner);
    }
}
