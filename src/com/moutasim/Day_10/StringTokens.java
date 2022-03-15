package com.moutasim.Day_10;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] wordsSplitted;

        // Write your code here.
        try {
            wordsSplitted = s.split("[ !,?._'@\\s]+");
            System.out.println(wordsSplitted.length);
            if (s.length() > 0) {
                for (String a : wordsSplitted) {
                    System.out.println(a);
                }
            } else {
                System.out.println(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        scan.close();
    }
}


