package com.yamcha;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] test = getIntegers(5);
        printArray(test);
        int[] sorted = sortIntegers(test);
        System.out.println("Sorted: " + Arrays.toString(sorted));
        System.out.println("Minimum Value: " + findMin(sorted));

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
        int[] sortedArray = array;
        Arrays.sort(sortedArray);

        int temp = 0;
        for (int i = 0; i < (sortedArray.length) / 2; i++) {
            temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
