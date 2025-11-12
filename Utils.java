package com.cit300.algorithmanalyzer;
import java.util.Random;
import java.util.Arrays;

public class Utils {
    public static int[] generateRandomArray(int size, long seed) {
        Random r = new Random(seed);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = r.nextInt(100000);
        return arr;
    }
    public static int[] copy(int[] src) {
        return Arrays.copyOf(src, src.length);
    }
}