public class BSTNode<T extends Comparable<T>> {
    private T data;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode() {
        // Construtor de um nó vazio (NIL)
    }

    public BSTNode(T data) {
        this.data = data;
        this.left = new BSTNode<>();
        this.right = new BSTNode<>();
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
}