package com.operators;

import java.util.Scanner;

public class LCM43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value:  ");
        int a = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int b = scanner.nextInt();
        int c = a , d = b;

        while(a!=b){
            if(a > b){
                a-=b;
            }else{
                b-=a;
            }
        }
        int lcm = c*d/a;  // formula if we know gcd given output multiples divide by equal number after loop
        System.out.println("LCM:  " + lcm);
    }
}
