import java.util.ArrayList;

public class BSTImpl<T extends Comparable<T>> implements BST<T> {
    protected BSTNode<T> root;

    public BSTImpl() {
        this.root = new BSTNode<>();
    }

    @Override
    public BSTNode<T> getRoot() {
        return this.root;
    }

    @Override
    public boolean isEmpty() {
        return this.root.isEmpty();
    }

    @Override
    public void insert(T element) {
        if (element != null) {
            insert(this.root, element);
        }
    }

    private void insert(BSTNode<T> node, T element) {
        if (node.isEmpty()) {
            node.setData(element);
            node.setLeft(new BSTNode<>());
            node.getLeft().setParent(node);
            node.setRight(new BSTNode<>());
            node.getRight().setParent(node);
        } else {
            if (element.compareTo(node.getData()) < 0) {
                insert(node.getLeft(), element);
            } else if (element.compareTo(node.getData()) > 0) {
                insert(node.getRight(), element);
            }
        }
    }
    
    @Override
    public BSTNode<T> search(T element) {
        if (element == null) {
             return new BSTNode<>();
        }
        return search(this.root, element);
    }

    private BSTNode<T> search(BSTNode<T> node, T element) {
        if (node.isEmpty() || element.equals(node.getData())) {
            return node;
        }
        if (element.compareTo(node.getData()) < 0) {
            return search(node.getLeft(), element);
        } else {
            return search(node.getRight(), element);
        }
    }

    @Override
    public T[] order() {
        ArrayList<T> list = new ArrayList<>();
        order(this.root, list);
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Comparable[list.size()];
        return list.toArray(result);
    }

    private void order(BSTNode<T> node, ArrayList<T> list) {
        if (!node.isEmpty()) {
            order(node.getLeft(), list);
            list.add(node.getData());
            order(node.getRight(), list);
        }
    }
}