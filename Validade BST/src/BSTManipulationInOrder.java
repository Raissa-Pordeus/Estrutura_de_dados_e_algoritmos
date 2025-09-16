public interface BSTManipulationInOrder<T extends Comparable<T>> {
    /**
     * Verifica se uma dada árvore binária é uma Árvore Binária de Busca (BST) válida.
     *
     * @param tree A árvore a ser validada.
     * @return true se a árvore for uma BST válida, false caso contrário.
     */
    boolean isValidBST(BST<T> tree);
}