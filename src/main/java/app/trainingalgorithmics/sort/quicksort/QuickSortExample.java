package app.trainingalgorithmics.sort.quicksort;

import java.util.Arrays;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] list = { 83, 3, 99, 32, 92, 3, 63, 1, 8, 60, 2, 6, 45, 97 };

        String result = Arrays.toString(QuickSort.sort(list));

        System.out.println(result);
    }
}
