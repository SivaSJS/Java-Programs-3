package com.operators;

import java.util.Scanner;

public class MultiplicationTable40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}
