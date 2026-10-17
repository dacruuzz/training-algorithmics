package app.trainingalgorithmics.search.binary;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] normalList     = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] emptyList      = {};
        int[] oneElementList = {1};

        int result1 = BinarySearch.search(normalList, 7);
        int result2 = BinarySearch.search(emptyList, 2);
        int result3 = BinarySearch.search(oneElementList, 1); // case: element == target
        int result4 = BinarySearch.search(oneElementList, 5); // case: element != target

        System.out.println("Index: " + result1);
        System.out.println("Index: " + result2);
        System.out.println("Index: " + result3);
        System.out.println("Index: " + result4);
    }
}
