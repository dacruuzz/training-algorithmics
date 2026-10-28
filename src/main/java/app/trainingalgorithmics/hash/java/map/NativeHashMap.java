package app.trainingalgorithmics.hash.java.map;

import app.trainingalgorithmics.hash.HashMapTable;

import java.util.HashMap;
import java.util.Map;

public class NativeHashMap<K, V> implements HashMapTable<K, V> {

    private final Map<K, V> map = new HashMap<>();

    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public V remove(K key) {
        return map.remove(key);
    }

    @Override
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
