package com.tadashi.challenge;

public class TwoDArray {
    public static void main(String[] args) {

        String[] input = new String[6];

        //Test 1
        //input[0] = "1 1 1 0 0 0";
        //input[1] = "0 1 0 0 0 0";
        //input[2] = "1 1 1 0 0 0";
        //input[3] = "0 0 2 4 4 0";
        //input[4] = "0 0 0 2 0 0";
        //input[5] = "0 0 1 2 4 0";

        input[0] = "0 -4 -6 0 -7 -6";
        input[1] = "-1 -2 -6 -8 -3 -1";
        input[2] = "-8 -4 -2 -8 -8 -6";
        input[3] = "-3 -1 -2 -5 -7 -4";
        input[4] = "-3 -5 -3 -6 -6 -6";
        input[5] = "-3 -6 0 -8 -6 -7";

        int[][] arr = new int[6][6];
        for (int i = 0; i < input.length; i++) {
            String[] arrRowItems = input[i].split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int highestHourglassSum = hourglassSum(arr);
        System.out.print(highestHourglassSum);
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int highestHourglassSum = Integer.MIN_VALUE;

        // O(N) where N = 1z
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j]; //a - O(1)
                sum = sum + arr[i][j + 1]; //b - O(1)
                sum = sum + arr[i][j + 2]; //c - O(1)
                sum = sum + arr[i + 1][j + 1]; //d - O(1)
                sum = sum + arr[i + 2][j]; //e - O(1)
                sum = sum + arr[i + 2][j + 1]; //f - O(1)
                sum = sum + arr[i + 2][j + 2]; //g - O(1)

                if (sum > highestHourglassSum) {
                    highestHourglassSum = sum;
                }

            }
        }
        return highestHourglassSum;
    }
}
