public interface HeapManipulation<T extends Comparable<T>> {

    /**
     * O Heapsort é um dos algoritmos de ordenação mais conhecidos.
     * Este método deve receber um array de elementos e retorná-lo ordenado
     * em ordem CRESCENTE.
     * Dica: Lembre-se que a implementação base é uma Min-Heap.
     */
    T[] heapsort(T[] array);

    /**
     * Verifica se um dado array representa uma Min-Heap válida.
     * Você não deve construir uma nova Heap para isso. A verificação deve ser feita
     * diretamente no array, usando as fórmulas de acesso a pais e filhos.
     * Lembre-se: para ser uma Min-Heap, todo pai deve ser menor ou igual a seus filhos.
     */
    boolean isMinHeap(T[] array);
    /**
     * Enunciado 3: Estatística de Ordem - Encontrar os K Maiores Elementos
     * Deve receber um array e um inteiro 'k', e retornar um novo array
     * contendo os 'k' maiores elementos do array original.
     * O array retornado não precisa estar ordenado.
     */
    T[] findKLargest(T[] array, int k);
}