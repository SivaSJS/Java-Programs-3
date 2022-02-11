package com.operators;

public class PowerofNumber47 {
    public static void main(String[] args) {
        // 2 power 5 = 32    =>      2 * 2 * 2 * 2 * 2 = 32

        double powerOfNumber = Math.pow(2,5); // in build class available for finding power of a number

        int value = (int) powerOfNumber; // casting because it would output with decimal like ( .0 )
        System.out.println(value);
    }
}
