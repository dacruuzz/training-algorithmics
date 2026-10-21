package app.trainingalgorithmics.hash;

public interface HashTable<K, V> {

    /**
     * Insert or update a value of the hash table.
     *
     * @param key used for map a key to a value.
     * @param value save data linked at the key param.
     */
    void put(K key, V value);

    /**
     * Search the value by key informed.
     *
     * @param key used for search a value linked at the key.
     * @return value of the key.
     */
    V get(K key);

    /**
     * Remove a value by key informed.
     *
     * @param key used for search a value linked at the key.
     * @return value of the key.
     */
    V remove(K key);

    /**
     * Returns a boolean value.
     * Verify if the key informed is in map.
     *
     * @param key used for search a value linked at the key.
     * @return value of the key.
     */
    boolean containsKey(K key);
}
