package com.junling2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt() { //doesn't work for negative numbers
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter An Integer: ");

        String input = s.next();
        char[] inputArray = input.toCharArray();
        for (char c : inputArray) {
            if (!Character.isDigit(c)) {
                return 0;
            }
        }
        return Integer.parseInt(input);
    }

    private static int getIntEAFP() { //denser code and more accurate
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter An Integer: ");

        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) { // look before you leap approach, check for condition first
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) { // try first, handle any exceptions later,
        // useful if you don't know what condition to check for, or condition is complicated to code
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
