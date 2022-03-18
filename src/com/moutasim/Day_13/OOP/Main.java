package com.moutasim.Day_13.OOP;

public class Main {
    public static void main(String[] args) {

        BankAccount moutasim = new BankAccount(
                1080415,
                200000,
                "Moutasim",
                "moutasim9997@gmail.com",
                "+971556170992"
        );
        BankAccount mark = new BankAccount(
                105732,
                250000,
                "Mark",
                "mark@gmail.com",
                "+971551279298"
        );

        moutasim.withdraw(3000);
        mark.deposit(100000);
        System.out.println(moutasim.toString() + "\n");
        System.out.println(mark.toString());

        System.out.println("\n----------------\n" + "     Update   \n" + "----------------");

        moutasim.withdraw(2000000);
        mark.deposit(30020);
        System.out.println(moutasim.toString() + "\n");
        System.out.println(mark.toString());

    }
}
