package com.tadashi.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        // Logarithmic time complexity - O(log n)
        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array: " +
                Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }

        System.out.println("Modified Array O(log n): " +
                Arrays.toString(array));

        // Using Collections
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
        Collections.reverse(arrayList);

        System.out.println("Modified Array using Collections: " +
                Arrays.toString(arrayList.toArray()));
    }
}
