package app.trainingalgorithmics.search.binary;

public class BinarySearchExample {

    public static void main(String[] args) {
        Integer[] normalList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] emptyList = new Integer[]{};
        Integer[] oneElementList = {5};

        String result1 = BinarySearch.search(normalList, 1);
        String result2 = BinarySearch.search(emptyList, 1);
        String result3 = BinarySearch.search(oneElementList, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
