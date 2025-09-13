public class ExtendedBSTManipulationImpl<T extends Comparable<T>> implements ExtendedBSTManipulation<T> {
 

    @Override
    public int countNodesInRange(BST<T> tree, T min, I max){
        if(tree.isEmpty() || min.compareTo(max) > 0)return 0;
        else return countNodesInRange((BST<T>) tree.getRoot(), min, max);
    }

    private int countNodesInRange(BST<T> tree, T min, T max) {
        /*Implementar um método que conte a quantidade de nós
        em uma Árvore Binária de Busca (BST) cujos valores de
        dados pertencem a um intervalo fechado [min, max].*/
        int count = 0;
        int countLeft = countNodesInRange(tree.getLeft(), min, max);
        int countRight = countNodesInRange(tree.getRight(), min, max);
        T currentNodeData = node.getData();
        if(tree.isEmpty()){// se o nó for vazio, não contribui para a contagem
            return 0;
        }else if(currentNodeData.compareTo(min)>=0 && currentNodeData.compareTo(max)<=0){
            count = 1;
        }
        return count + countLeft + countRight;
    }

    @Override
    public boolean isFullBinaryTree(BST<T> tree) {
        /*Objetivo:
        Verificar se uma dada árvore binária de busca é uma "Árvore Binária Cheia" (Full Binary Tree).

        Descrição Detalhada:
        Uma árvore é considerada "cheia" se, e somente se, cada um de seus nós possuir zero ou dois filhos.
        Em outras palavras, nenhuma nó na árvore pode ter exatamente um filho. O método deve validar essa
        propriedade para toda a estrutura da árvore. */
        // Um nó com apenas 1 filho (esquerdo ou direito) torna a árvore inteira "não-cheia".
        if(tree.isEmpty()) return true; //uma árvore vazia é considerada "cheia"
        return isFullBinaryTree(tree.getRoot()); //se a árvore não for vazia, começa a verificação recursiva pela raiz
    }

    /*
    * Método auxiliar recursivo que faz a verificação nó por nó
    * @param node - nó atual que estamos analisando na árvore
    */
    private boolean isFullBinaryTree(BST<T> node){
        //Caso 1: se chegamos em um nó vazio
        if(node.isEmpty()) return true;
        //Caso 2: se chegamos em um nó com exatamente um filho - CONDIÇÃO DE FALHA,
        boolean left = !node.getLeft().isEmpty();
        boolean right = !node.getRight().isEmpty();
        if (left^right) return false; //se esquerda ou direita estiverem vazios(só tiver filho em um dos lados)
        //Caso 3: Por eliminação o nó tem dois filhos
        return isFullBinaryTree(node.getLeft()) && isFullBinaryTree(node.getRight());//chama o método recursivo para 
        //a verificaçaõ na esquerda e na direita
    }
}
