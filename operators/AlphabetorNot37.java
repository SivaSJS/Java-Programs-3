package com.operators;

import java.util.Scanner;

public class AlphabetorNot37 {
    public static void main(String[] args) {

        System.out.print("enter the character: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
