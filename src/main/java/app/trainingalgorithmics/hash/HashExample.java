package app.trainingalgorithmics.hash;

import app.trainingalgorithmics.hash.java.linkedmap.NativeLinkedHashMap;
import app.trainingalgorithmics.hash.java.map.NativeHashMap;

public class HashExample {
    public static void main(String[] args) {

        HashMapTable<String, Integer> map = new NativeHashMap<>();
        HashMapTable<String, Integer> linked = new NativeLinkedHashMap<>();

        for (String k : new String[]{"England", "Brazil", "India", "Austria", "Norway", "USA"}) {
            map.put(k, k.length());
            linked.put(k, k.length());
        }

        // Linked x Map
        System.out.println("map: " + map); // {Austria=7, USA=3, Norway=6, England=7, Brazil=6, India=5}
        System.out.println("linked: " + linked); // {England=7, Brazil=6, India=5, Austria=7, Norway=6, USA=3}
    }
}
