public interface BSTManipulationPostOrder<T extends Comparable<T>> {

    /**
     * Calcula a altura de uma Árvore Binária de Busca.
     *
     * @param tree A árvore cuja altura será calculada.
     * @return Um inteiro representando a altura da árvore.
     */
    int height(BST<T> tree);
}