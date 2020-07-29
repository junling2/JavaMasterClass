package com.yamcha;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] test = getIntegers(5);
        printArray(test);


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        System.out.println("Values: " + Arrays.toString(array));
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        
    }


}
