package com.tadashi.challenge;

import java.util.LinkedList;
import java.util.List;

public class LeftRotation {

    // Solved this problem using LinkedList data structure
    // that implements Queue abstract data type
    // FIFO - First In First Out
    public static void main(String[] args) {
        int d = 2;
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> result = rotateLeft(d, arr);

        for (Integer number : result) {
            System.out.println(number);
        }
    }

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_LINKED_LIST arr
     */
    public static List<Integer> rotateLeft(int d, LinkedList<Integer> arr) {

        while (d > 0) {
            arr.add(arr.pop());
            --d;
        }

        return arr;
    }
}
