package com.operators;

import java.util.Scanner;

public class CountNumofDigitsInteger45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Input number: ");
        int a = scanner.nextInt();
        int val = 0;
        while (a > 0){
            a = a /10;
            val++;
        }
        System.out.println("Number of digits in given input is: " + val);

    }
}
