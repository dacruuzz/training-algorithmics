package app.trainingalgorithmics.hash.java.hashmap;

import app.trainingalgorithmics.hash.HashTable;

public class NativeHashMapExample {

    public static void main(String[] args) {
        HashTable<String, String> hashTable = new NativeHashMap<>();

        hashTable.put("Brasil", "Brasília");
        hashTable.put("Inglaterra", "Londres");
        hashTable.put("Japão", "Tokio");
        hashTable.put("Angola", "Luanda");

        System.out.println(hashTable.get("Inglaterra"));
        System.out.println(hashTable.get("França"));

        hashTable.remove("Inglaterra");
        System.out.println(hashTable.get("Inglaterra"));
        System.out.println(hashTable.containsKey("Inglaterra"));

        System.out.println(hashTable.remove("Japão"));
    }
}
