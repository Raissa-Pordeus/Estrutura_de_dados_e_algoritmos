public class BSTNode<T extends Comparable<T>> {
    private T data;
    private BSTNode<T> left;
    private BSTNode<T> right;
    private BSTNode<T> parent;

    public BSTNode() {
        // Construtor de um nó vazio (NIL)
    }

    // Construtor para um nó com dados
    public BSTNode(T data, BSTNode<T> left, BSTNode<T> right, BSTNode<T> parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public boolean isEmpty() {
        return this.data == null;
    }

    // Getters e Setters
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    public BSTNode<T> getLeft() { return left; }
    public void setLeft(BSTNode<T> left) { this.left = left; }
    public BSTNode<T> getRight() { return right; }
    public void setRight(BSTNode<T> right) { this.right = right; }
    public BSTNode<T> getParent() { return parent; }
    public void setParent(BSTNode<T> parent) { this.parent = parent; }
}