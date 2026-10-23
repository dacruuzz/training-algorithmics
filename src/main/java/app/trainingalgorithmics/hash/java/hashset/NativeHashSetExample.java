package app.trainingalgorithmics.hash.java.hashset;

import app.trainingalgorithmics.hash.HashSetTable;

public class NativeHashSetExample {

    public static void main(String[] args) {
        HashSetTable<String> hashSetTable = new NativeHashSet<>();

        hashSetTable.add("England");
        hashSetTable.add("Brazil");
        hashSetTable.add("USA");
        hashSetTable.add("Brazil"); // Conflict
        hashSetTable.add("Canada");
        System.out.println(hashSetTable);

        hashSetTable.remove("England"); // Removes element
        System.out.println(hashSetTable);

        hashSetTable.remove("China"); // Does nothing
        System.out.println(hashSetTable);

        System.out.println(hashSetTable.contains("Canada")); // true
        System.out.println(hashSetTable.contains("Japan")); // false

        System.out.println(hashSetTable.size());
    }
}
