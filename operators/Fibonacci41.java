package com.operators;

import java.util.Scanner;

public class Fibonacci41 {
    public static void main(String[] args) {
            int a = -1 ;
            int b =1;
            int c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
            for (int i = 0; i <= n; i++){
                c = a+b;
                a =b;
                b= c;
            }

        System.out.println("Fibonacci value of " + n + " is " + b);
    }
}
