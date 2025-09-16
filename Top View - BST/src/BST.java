public interface BST<T extends Comparable<T>> {
    BSTNode<T> getRoot();
    boolean isEmpty();
    void insert(T element);
}