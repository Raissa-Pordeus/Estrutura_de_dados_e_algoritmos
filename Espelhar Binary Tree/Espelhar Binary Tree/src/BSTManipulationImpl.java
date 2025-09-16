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
        //Passo 1 recursivo - espelha o filho *direito* do original para o filho *esquerdo* do espelhado
        if(!originalNode.getRight().isEmpty()){
            BSTNode<T> newLeftNode = new BSTNode<>();//cria um nó vazio
            newLeftNode.setData(originalNode.getRight().getData());
            newLeftNode.setParent(mirroredNode);
            mirroredNode.setLeft(newLeftNode);
            mirrorRecursive(originalNode.getRight(), newLeftNode);
        } else {
            //Passo 2 - se o filho *direito* do original for vazio, cria um filho *esquerdo* vazio no espelhado
            BSTNode<T> emptyLeftNode = new BSTNode<>();
            emptyLeftNode.setParent(mirroredNode);
            mirroredNode.setLeft(emptyLeftNode);
        }
        //Passo 3 recursivo - espelha o filho *esquerdo* do original para o filho *direito* do espelhado
        if(!originalNode.getLeft().isEmpty()){
            BSTNode<T> newRightNode = new BSTNode<>();//cria um nó vazio
            newRightNode.setData(originalNode.getLeft().getData());
            newRightNode.setParent(mirroredNode);
            mirroredNode.setRight(newRightNode);
            mirrorRecursive(originalNode.getLeft(), newRightNode);
        } else {
            //Passo 4 - se o filho *esquerdo* do original for vazio, cria um filho *direito* vazio no espelhado
            BSTNode<T> emptyRightNode = new BSTNode<>();
            emptyRightNode.setParent(mirroredNode);
            mirroredNode.setRight(emptyRightNode);
        }
    }

}