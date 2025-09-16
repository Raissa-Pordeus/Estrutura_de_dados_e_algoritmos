public class BSTManipulationPostOrderImpl<T extends Comparable<T>> implements BSTManipulationPostOrder<T> {

    @Override
    public int height(BST<T> tree) {
        if(tree.isEmpty()||tree==null){
            return -1;
        }
        return heightRecursive(tree.getRoot());
    }
    
    private int heightRecursive(BSTNode<T> node) {
        if(node.isEmpty()){
            return -1;
        }
        int altD = heightRecursive(node.getRight());
        int altE = heightRecursive(node.getLeft());
        return 1+Math.max(altD, altE);
        
    }
}