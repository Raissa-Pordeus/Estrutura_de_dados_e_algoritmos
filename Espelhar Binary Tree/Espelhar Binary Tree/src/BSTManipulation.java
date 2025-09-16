public interface BSTManipulation<T extends Comparable<T>> {

    /**
     * Cria e retorna uma NOVA Árvore Binária de Busca que é uma
     * imagem espelhada da árvore original.
     *
     * @param tree A árvore original que será espelhada.
     * @return Uma nova BST que é a versão espelhada da original.
     */
    BST<T> mirror(BST<T> tree);
}