package app.trainingalgorithmics.hash.java.set;

import app.trainingalgorithmics.hash.HashSetTable;

import java.util.HashSet;
import java.util.Set;

public class NativeHashSet<E> implements HashSetTable<E> {

    private final Set<E> set = new HashSet<>();

    @Override
    public boolean add(E element) {
        return set.add(element);
    }

    @Override
    public boolean contains(E element) {
        return set.contains(element);
    }

    @Override
    public boolean remove(E element) {
        return set.remove(element);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
