package com.tadashi.challenge;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App 
{
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int chunkSize = 2;

        int[][] resultado = chunk(numeros, chunkSize);

        Arrays.stream(resultado)
                .map(Arrays::toString)
                    .forEach(System.out::println);
    }

    public static int[][] chunk(int[] numeros, int chunkSize) {
        return IntStream.iterate(0, i -> i + chunkSize)
                .limit((long) Math.ceil((double) numeros.length / chunkSize))
                .mapToObj(j -> Arrays.copyOfRange(numeros, j, j + chunkSize > numeros.length ? numeros.length : j + chunkSize))
                .toArray(int[][]::new);
    }
}
