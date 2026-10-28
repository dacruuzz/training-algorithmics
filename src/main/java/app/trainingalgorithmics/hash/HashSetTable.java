package app.trainingalgorithmics.hash;

public interface HashSetTable<E> {

    boolean add(E element);

    boolean contains(E element);

    boolean remove(E element);

    int size();
}
