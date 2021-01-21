package com.tadashi.challenge;

public class SparseArray {
    public static void main(String[] args) {
        String[] strings = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};
        int[] result = matchingStrings(strings, queries);

        for (int numberOfResults : result) {
            System.out.println(numberOfResults);
        }
    }

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int queryResult = 0;
            for (String value : strings) {
                if (value.equals(queries[i])) {
                    queryResult++;
                }
            }

            result[i] = queryResult;
        }

        return result;
    }
}
