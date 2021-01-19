package com.tadashi.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] array = IntStream.rangeClosed(1, 1000000)
                .boxed().collect(Collectors.toList()).toArray(new Integer[0]);

        //System.out.println("Original Array: " + Arrays.toString(array));
        // Logarithmic time complexity - O(log n)
        long logarithmicTimeStart = System.nanoTime();
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        long logarithmicTimeEnd = System.nanoTime();
        long logarithmicExecutionTime = logarithmicTimeEnd - logarithmicTimeStart;

        //System.out.println("Modified Array O(log n): " + Arrays.toString(array));
        System.out.println("Modified Array O(log n) Execution Time (ms): " + logarithmicExecutionTime/1000000);

        // Using Collections
        long collectionsTimeStart = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
        Collections.reverse(arrayList);
        long collectionsTimeEnd = System.nanoTime();
        long collectionsExecutionTime = collectionsTimeEnd - collectionsTimeStart;

        //System.out.println("Modified Array using Collections:" + Arrays.toString(arrayList.toArray()));
        System.out.println("Modified Array using Collections Execution Time (ms): " + collectionsExecutionTime/1000000);
    }
}
