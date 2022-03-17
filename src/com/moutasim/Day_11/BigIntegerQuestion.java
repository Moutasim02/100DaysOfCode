package com.moutasim.Day_11;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger firstNumber = scan.nextBigInteger();
        BigInteger secondNumber = scan.nextBigInteger();
        scan.close();

        BigInteger addition = firstNumber.add(secondNumber);
        System.out.println(addition);
        BigInteger multiplication = firstNumber.multiply(secondNumber);
        System.out.println(multiplication);

    }
}
