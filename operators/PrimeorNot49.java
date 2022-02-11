package com.operators;

import java.util.Scanner;

public class PrimeorNot49 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        // Checking if num is prime or not
        if (isPrime(num))
            System.out.println("Number is Prime");
        else
            System.out.println("Number is Not Prime");

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }


}
