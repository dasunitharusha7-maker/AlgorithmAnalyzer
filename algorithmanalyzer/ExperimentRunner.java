package com.cit300.algorithmanalyzer;
import java.util.Arrays;
public class ExperimentRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        long seed = 12345L;

        // Member 1 – Linear Search
        System.out.println("Algorithm: Linear Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");
        for (int size : sizes) {
            int[] arr = Utils.generateRandomArray(size, seed);
            int key = arr[size / 2];
            long start = System.nanoTime();
            LinearSearch.linearSearch(arr, key);
            long end = System.nanoTime();
            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeMs);
        }
        System.out.println();

        // Member 2 – Binary Search
        System.out.println("Algorithm: Binary Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");
        for (int size : sizes) {
            int[] arr = Utils.generateRandomArray(size, seed);
            Arrays.sort(arr);
            int key = arr[size / 2];
            long start = System.nanoTime();
            BinarySearch.binarySearch(arr, key);
            long end = System.nanoTime();
            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeMs);
        }
        System.out.println();

        // Member 3 – Bubble Sort
        System.out.println("Algorithm: Bubble Sort");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");
        for (int size : sizes) {
            int[] arr = Utils.generateRandomArray(size, seed);
            long start = System.nanoTime();
            BubbleSort.bubbleSort(arr);
            long end = System.nanoTime();
            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeMs);
        }
        System.out.println();

        // Member 4 – Quick Sort
        System.out.println("Algorithm: Quick Sort");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");
        for (int size : sizes) {
            int[] arr = Utils.generateRandomArray(size, seed);
            long start = System.nanoTime();
            QuickSort.quickSort(arr, 0, arr.length - 1);
            long end = System.nanoTime();
            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("%-10d | %.4f%n", size, timeMs);
        }
        System.out.println("\nAll algorithms completed successfully!");
    }
}