package com.operators;

import java.util.Scanner;

public class Factorial39 {
    public static void main(String[] args) {
        int factorial= 1;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            factorial = factorial * i;
        }

        System.out.print("Factorial Number of " + num + " is " + factorial);
    }
}
