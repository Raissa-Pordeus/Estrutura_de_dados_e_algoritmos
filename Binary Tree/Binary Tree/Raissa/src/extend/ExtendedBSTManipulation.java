public interface ExtendedBSTManipulation<T extends Comparable<T>> {

    /**
     * Conta o número de nós na árvore cujos valores estão no intervalo [min, max],
     * incluindo os próprios min e max.
     */
    int countNodesInRange(BST<T> tree, T min, T max);

    /**
     * Verifica se a árvore é uma "Árvore Binária Cheia".
     * Uma árvore binária é cheia se cada nó tiver 0 ou 2 filhos.
     * Nenhum nó pode ter apenas 1 filho.
     */
    boolean isFullBinaryTree(BST<T> tree);
}