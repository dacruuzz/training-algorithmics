package app.trainingalgorithmics.hash.java.map;

import app.trainingalgorithmics.hash.HashMapTable;

public class NativeHashMapExample {

    public static void main(String[] args) {
        HashMapTable<String, String> hashMapTable = new NativeHashMap<>();

        hashMapTable.put("England", "London");
        hashMapTable.put("Brazil", "Brasilia");
        hashMapTable.put("India", "New Dehli");
        hashMapTable.put("Austria", "Wien");
        hashMapTable.put("Norway", "Oslo");
        hashMapTable.put("Norway", "Oslo"); // Duplicate

        System.out.println(hashMapTable.get("England"));
        System.out.println(hashMapTable.get("France"));

        hashMapTable.remove("England");
        System.out.println(hashMapTable.get("England"));
        System.out.println(hashMapTable.containsKey("England"));

        System.out.println(hashMapTable.remove("Japan"));

        System.out.println(hashMapTable);
    }
}
