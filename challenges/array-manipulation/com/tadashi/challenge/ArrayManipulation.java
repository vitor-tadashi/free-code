package com.tadashi.challenge;

public class ArrayManipulation {

    public static void main(String[] args) {
        int n = 10;

        int[][] queries = {{1,5,3},{4,8,7},{6,9,1}};
        long largestValue = arrayManipulation(n, queries);

        System.out.println(largestValue);
    }

    // Complete the arrayManipulation function below.
    // O(N*M)
    static long arrayManipulationSlow(int n, int[][] queries) {
        int[] array = new int[n];
        long largestValue = 0;

        for (int i = 0; i < queries.length; i++) {
            int initialPosition = queries[i][0] - 1;
            int endPosition = queries[i][1] - 1;

            for (;initialPosition <= endPosition;initialPosition++) {
                array[initialPosition] = array[initialPosition] + queries[i][2];

                if (array[initialPosition] > largestValue) {
                    largestValue = array[initialPosition];
                }
            }
        }

        return largestValue;
    }

    // Complete the arrayManipulation function below.
    // O(N+M)
    static long arrayManipulation(int n, int[][] queries) {
        /* Save interval endpoint's "k" values in array */
        long [] array = new long[n + 1];
        long largestValue = 0;

        for (int i = 0; i < queries.length; i++) {
            int initialPosition = queries[i][0];
            int endPosition = queries[i][1];
            int value = queries[i][2];
            array[initialPosition-1] += value;
            array[endPosition] -= value;
        }

        /* Find max value */
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            largestValue = Math.max(largestValue, sum);
        }

        return largestValue;
    }
}
