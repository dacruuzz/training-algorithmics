package app.trainingalgorithmics.hash.java.linkedmap;

import app.trainingalgorithmics.hash.HashMapTable;

public class NativeLinkedHashMapExample {

    public static void main(String[] args) {
        HashMapTable<String, String> hashMapTable = new NativeLinkedHashMap<>();

        hashMapTable.put("England", "London");
        hashMapTable.put("Brazil", "Brasilia");
        hashMapTable.put("India", "New Dehli");
        hashMapTable.put("Austria", "Wien");
        hashMapTable.put("Norway", "Oslo");
        hashMapTable.put("Norway", "Oslo"); // Duplicate

        System.out.println(hashMapTable);
    }
}
