package app.trainingalgorithmics.hash.java.linkedmap;

import app.trainingalgorithmics.hash.HashMapTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class NativeLinkedHashMap<K, V> implements HashMapTable<K, V> {

    private final Map<K, V> linkedHashMap = new LinkedHashMap<>();

    @Override
    public void put(K key, V value) {
        linkedHashMap.put(key, value);
    }

    @Override
    public V get(K key) {
        return linkedHashMap.get(key);
    }

    @Override
    public V remove(K key) {
        return linkedHashMap.remove(key);
    }

    @Override
    public boolean containsKey(K key) {
        return linkedHashMap.containsKey(key);
    }

    @Override
    public String toString() {
        return linkedHashMap.toString();
    }
}
