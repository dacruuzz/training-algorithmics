package app.trainingalgorithmics.sort.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static int[] sort(int[] list) {
        if (list.length < 2) return list;

        int pivotIndex = list.length / 2;
        int pivotValue = list[pivotIndex];

        List<Integer> less  = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> more  = new ArrayList<>();

        for (int item : list) {
            if (item < pivotValue) less.add(item);
            if (item > pivotValue) more.add(item);
            if (item == pivotValue) equal.add(item);
        }

        int[] lessArray = sort();
    }

    private int[] toArray() {

    }
}
