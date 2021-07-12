package com.company;

public class Loop {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            if (i % 6 == 0){
                System.out.println("i = " + i);
            }
        }
    }
}
