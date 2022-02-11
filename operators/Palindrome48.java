package com.operators;

public class Palindrome48 {
    public static void main(String[] args) {


        int a = 1221;
        int b;
        int c = a;
        int sum = 0;

        while (a > 0) {
            b = a % 10;    // It should be remainder 1 => b = 1;
            a = a / 10;    // It should be 122 since it is integer it doesn't take decimal places => a = 122;
            sum = (sum * 10) + b;  // sum is initially 0 now sum will be... sum = ( 0 * 10 ) + 1 =>  sum = 1;
            //continue the process until the  int a goes less to 0
        }
        if (c == sum)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not a Palindrome number");



    }


}
