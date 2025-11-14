import java.util.Arrays;

public class BinarySearchAnalyzer {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        System.out.println("Algorithm: Binary Search");
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");

        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateRandomArray(size);
            Arrays.sort(arr);
            int key = arr[size / 2];

            long start = System.nanoTime();
            binarySearch(arr, key);
            long end = System.nanoTime();

            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("%10d | %.4f%n", size, timeMs);
        }
    }
}
