package app.trainingalgorithmics.search.binary;

public class Main {

    public static void main(String[] args) {
        Integer[] normalList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] emptyList = new Integer[]{};
        Integer[] oneElementList = {5};

        String result1 = Binary.search(normalList, 1);
        String result2 = Binary.search(emptyList, 1);
        String result3 = Binary.search(oneElementList, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
