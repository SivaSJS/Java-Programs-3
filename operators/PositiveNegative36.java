package com.operators;

import java.util.Scanner;

public class PositiveNegative36 {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Entered number is Positive");
        } else if (a < 0) {
            System.out.println("Entered number is Negative");
        } else {
            System.out.println("Entered number is zero");
        }

    }
}
