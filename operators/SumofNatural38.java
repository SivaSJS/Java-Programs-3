package com.operators;

import java.util.Scanner;

public class SumofNatural38 {
    public static void main(String[] args) {

        System.out.print("Enter the Natural Number: ");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = n * (n + 1) / 2; // Mathematical Formula

        System.out.println("Sum of natural number " + n +  " is "  + sum);
    }
}
