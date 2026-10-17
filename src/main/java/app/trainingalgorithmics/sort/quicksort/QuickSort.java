package app.trainingalgorithmics.sort.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    /**
     * Sorts the given array in ascending order using QuickSort.
     * The original array is not modified.
     * <p>
     * Time: O(n log n) average, O(n^2) worst case. Space: O(n) extra.
     *
     * @param list array of primitive ints to be sorted.
     * @return an array with the elements in ascending order.
     * For inputs with fewer than 2 elements, the same array instance is returned.
     */
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

        int[] lessArray  = sort(toArray(less));
        int[] equalArray = toArray(equal);
        int[] moreArray  = sort(toArray(more));

        return groupUp(lessArray, equalArray, moreArray);
    }

    private static int[] toArray(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] groupUp(int[] lessArray, int[] equalArray, int[] moreArray) {
        List<Integer> result = new ArrayList<>();

        for (Integer item : lessArray) result.add(item);
        for (Integer item : equalArray) result.add(item);
        for (Integer item : moreArray) result.add(item);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
