package com.moutasim.Day_3;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMatRows, firstMatColns, secondMatRows, secondMatColns;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        firstMatRows = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        firstMatColns = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        secondMatRows = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        secondMatColns = s.nextInt();

        if (firstMatRows == secondMatRows && firstMatColns == secondMatColns) {
            int a[][] = new int[firstMatRows][firstMatColns];
            int b[][] = new int[secondMatRows][secondMatColns];
            int sum[][] = new int[secondMatRows][secondMatColns];

            //loop to fill up the first matrix
            System.out.println("Enter all elements of the first matrix: ");
            for (int i = 0; i < firstMatRows; i++)
                for (int j = 0; j < firstMatColns; i++)
                    a[i][j] = scanner.nextInt();

            //loop to fill up the second matrix
            System.out.println("Enter all elements of the second matrix: ");
            for (int i = 0; i < secondMatRows; i++)
                for (int j = 0; j < secondMatColns; i++)
                    b[i][j] = scanner.nextInt();

            //Display the data entered for first matrix
            System.out.println("First Matrix");
            for (int i = 0; i < firstMatRows; i++) {
                for (int j = 0; j < firstMatColns; i++)
                    System.out.println(a[i][j] + "\t");
            }
            System.out.println("\n");

            //Display the data entered for second matrix
            System.out.println("Second Matrix");
            for (int i = 0; i < secondMatRows; i++) {
                for (int j = 0; j < secondMatColns; i++)
                    System.out.println(a[i][j] + "\t");
            }
            System.out.println("\n");

            //ok this was tough...
            for (int i = 0; i < firstMatRows; i++) {
                for (int j = 0; j < secondMatColns; j++) {
                    for (int k = 0; k < firstMatColns; k++) {
                        sum[i][j] = a[i][j] + b[i][j];
                    }
                }
            }

            //Display sum of added matrices
            System.out.println("Matrix Sum:");
            for (int i = 0; i < firstMatRows; i++) {
                for (int j = 0; j < secondMatColns; j++) {
                    System.out.println(a[i][j] + "\t");
                }
            }
            System.out.println("\n");

        } else {
            System.out.println("Addition is not possible for the entered matrix");
        }
    }
}
