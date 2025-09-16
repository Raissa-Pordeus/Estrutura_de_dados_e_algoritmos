import java.util.ArrayList;

public class BSTManipulationInOrderImpl<T extends Comparable<T>> implements BSTManipulationInOrder<T> {

    @Override
    public boolean isValidBST(BST<T> tree) {
        if(tree.isEmpty()||tree==null){
            return true;
        }
        ArrayList<T> orderedTree = new ArrayList<>();
        isValidBSTRecursive(tree.getRoot(), orderedTree);
        for(int i=1;i<orderedTree.size();i++){
            if(orderedTree.get(i).compareTo(orderedTree.get(i-1))<=0){
                return false;
            }
        }
            return true;
        }
        
    
    private void isValidBSTRecursive(BSTNode<T> nodeBst, ArrayList<T> list){
        if(nodeBst.isEmpty()||nodeBst==null){return;}
        isValidBSTRecursive(nodeBst.getLeft(), list);
        list.add(nodeBst.getData());
        isValidBSTRecursive(nodeBst.getRight(), list);
    }
}