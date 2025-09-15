public class BSTManipulationImpl<T extends Comparable<T>> implements BSTManipulation<T> {

    @Override
    public BST<T> mirror(BST<T> tree) {
        /*  Árvore Original:
         *   10
            /  \
            5    15
           /      \
          3        20
         
         
            Ávore Espelhada:
          10
         /  \
        15    5
        /      /
       20     3 
       **RESOLUÇÃO UTILIZANDO O PERCURSO PRÉ-ORDEM**
       */
        //Passo 1 - Cria uma árvore vazia para ser o resultado
        BST<T> newTree = new BSTImpl<>();
        //Passo 2 - verificar se a árvore original não é vazia
        if(!tree.isEmpty()){
            //Passo 3 - chama a função recursiva para definir o resultado como a nova raiz
            newTree.getRoot().setData(tree.getRoot().getData());//apenas para definir o primeiro nó na árvore espelhada
            mirrorRecursive(tree.getRoot(), newTree.getRoot());
        }
        return newTree;
    }

    private void mirrorRecursive(BSTNode<T> originalNode, BSTNode<T> mirroredNode){

    }

}