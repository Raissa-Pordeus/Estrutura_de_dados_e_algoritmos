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
}