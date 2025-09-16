public interface BST<T extends Comparable<T>> {
    BSTNode<T> getRoot();
    boolean isEmpty();
    void insert(T element);
    BSTNode<T> search(T element);
    T[] order(); 
}