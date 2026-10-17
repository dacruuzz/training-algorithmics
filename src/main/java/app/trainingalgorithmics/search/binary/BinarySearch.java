package app.trainingalgorithmics.search.binary;

public class BinarySearch {

    /**
     * Searches for the target in a sorted array using binary search.
     * <p>
     * Precondition: the array must be sorted in ascending order,
     * otherwise the result is undefined.
     * <p>
     * Time: O(log n). Space: O(1).
     *
     * @param list   array of ints sorted in ascending order.
     * @param target value to look for.
     * @return the index of the target, or -1 if it is not found
     * (including when the array is empty).
     * If the target appears more than once, any matching index may be returned.
     */
    public static int search(int[] list, int target) {
        int low  = 0;
        int high = list.length - 1;

        while (low <= high) {
            int med = (low + high) / 2;

            if (list[med] == target) return med;
            if (list[med] > target) high = med - 1;
            else low = med + 1;
        }

        return -1;
    }
}
