
package com.moutasim.Day_2;

// Use recursion to add all the numbers up to 10.
public class Recursion {
    private static final String RED = "\033[0;31m";
    private static final String BLUE = "\033[0;34m";

    private static void main(String[] args) {
        int k = sum(5);
        System.out.println(k);
    }

    private static int sum(int k) {
        if (k > 0) {
            return k + sum(--k);
        } else {
            System.out.println(RED + "Done from recursively calling my self -_-" + BLUE);
            return 0;
        }
    }
}
