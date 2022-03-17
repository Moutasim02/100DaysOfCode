package com.moutasim.Day_11;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
