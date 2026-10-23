package app.trainingalgorithmics.hash.java.hashmap;

import app.trainingalgorithmics.hash.HashMapTable;

public class NativeHashMapExample {

    public static void main(String[] args) {
        HashMapTable<String, String> hashMapTable = new NativeHashMap<>();

        hashMapTable.put("Brasil", "Brasília");
        hashMapTable.put("Inglaterra", "Londres");
        hashMapTable.put("Japão", "Tokio");
        hashMapTable.put("Angola", "Luanda");

        System.out.println(hashMapTable.get("Inglaterra"));
        System.out.println(hashMapTable.get("França"));

        hashMapTable.remove("Inglaterra");
        System.out.println(hashMapTable.get("Inglaterra"));
        System.out.println(hashMapTable.containsKey("Inglaterra"));

        System.out.println(hashMapTable.remove("Japão"));

        System.out.println(hashMapTable);
    }
}
