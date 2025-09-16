import java.util.ArrayList;
import java.util.List;

public class MyTraversal<T extends Comparable<T>> {

     public List<T> getEdges(BST<T> tree) {
        List<T> result = new ArrayList<>();
        if (tree.isEmpty() || tree==null) {
            return result;
        }
        traverseLeftEdgeRecursive(tree.getRoot(), result);
        traverseRightEdgeRecursive(tree.getRoot().getRight(), result);
        for(int i=0; i<result.size(); i++){
            //armazena no array
        }
        return result;
    }

    /**
     * Método auxiliar RECURSIVO para percorrer a borda esquerda.
     */
    private void traverseLeftEdgeRecursive(BSTNode<T> node, List<T> list) {
        if(node.isEmpty()||node==null){return;}
        list.add(node.getData());
        traverseLeftEdgeRecursive(node.getLeft(), list);
    }
    /**
     * Método auxiliar RECURSIVO para percorrer a borda direita.
     */
    private void traverseRightEdgeRecursive(BSTNode<T> node, List<T> list) {
        if(node.isEmpty()||node==null){return;}
        list.add(node.getData());
        traverseRightEdgeRecursive(node.getRight(), list);
    }
}