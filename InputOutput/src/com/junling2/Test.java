package com.junling2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{56, 2, 34, 57, 28, 4};
        List<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }
        Collections.sort(arrayList, Comparator.reverseOrder());
        int[] sortedArray = arrayList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(sortedArray));
        Arrays.sort(new Integer[]{3,5,6,3,3}, Comparator.reverseOrder());
    }
}
