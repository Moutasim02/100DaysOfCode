package com.moutasim.Day_10;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("String to check: ");
        String A=sc.next();
        String reversedString = "";
        char character;

        /* Enter your code here. Print output to STDOUT. */
        for (int i = 0; i < A.length(); i++) {
            character = A.charAt(i);
            reversedString = character + reversedString;
        }
        System.out.println(reversedString);
        if (A.equals(reversedString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
