package com.operators;


public class ReverseaNumber46 {
    public static void main(String[] args) {
        int a = 1234; int b =0;
        while (a!=0){
            int remainder = a % 10;
            b = b * 10 + remainder;
            a = a / 10;
        }
        System.out.println(b);

    }
}
