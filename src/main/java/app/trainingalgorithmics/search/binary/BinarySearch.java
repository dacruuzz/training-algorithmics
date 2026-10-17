package app.trainingalgorithmics.search.binary;

public class BinarySearch {

    public static String search(Integer[] list, int target) {
        if (list.length < 1) {
            return "List empty!";
        }
        if (list.length == 1) {
            return "The number is: " + list[0];
        }

        int low  = 0;
        int high = list.length - 1;

        while (low <= high) {
            int medium = (low + high) / 2;
            int guess  = list[medium];

            if (guess == target) {
                return "Index of target is " + medium;
            }
            if (guess > target) {
                high = medium - 1;
            } else {
                low = medium + 1;
            }
        }
        return "Process finish";
    }
}
