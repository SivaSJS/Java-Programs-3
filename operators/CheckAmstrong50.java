package com.operators;

public class CheckAmstrong50 {
    public static void main(String[] args) {
        int a = 152;
        int b = a;
        int amstrong = 0;
        int c = 0;
        while (a>0){
            c = a % 10;
            amstrong = amstrong + c * c*c;
            a = a/10;
        }

        if (b == amstrong)
            System.out.println("it is an Amstrong Number");
        else
            System.out.println("Not an Amstrong Number");
    }
}
