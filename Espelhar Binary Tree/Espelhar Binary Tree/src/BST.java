import java.util.ArrayList;

public interface BST<T extends Comparable<T>> {
    BSTNode<T> getRoot();
    boolean isEmpty();
    void insert(T element);
    BSTNode<T> search(T element);
    
    // Método para o teste, para visualizar a árvore
    T[] order(); 
}