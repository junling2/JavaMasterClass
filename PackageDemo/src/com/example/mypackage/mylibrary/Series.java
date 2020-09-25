package com.example.mypackage.mylibrary;

public class Series {
    public static long nSum(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        long factorial = 1;

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static int fib(int n) {
        int nMinusOne = 1;
        int nMinusTwo = 1;
        int fib = 0;

        if (n == 0) return 0;
        if (n <= 2) return 1;

        for (int i = 3; i <= n; i++) {
            fib = nMinusOne + nMinusTwo;
            nMinusTwo = nMinusOne;
            nMinusOne = fib;
        }
        return fib;
    }
}
