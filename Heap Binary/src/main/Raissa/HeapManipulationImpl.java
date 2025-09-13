import java.util.Arrays;

public class HeapManipulationImpl<T extends Comparable<T>> implements HeapManipulation<T> {

    @Override
    public T[] heapsort(T[] array) {
        //Caso base: Array nulo ou vazio
        if(array==null || array.length==0){
            return (T[]) Array.newInstance(array.getClass().getComponentType(), 0);
        }
        //cria uma instância de uam Min-Heap
        BinaryHeapImpl<T> minHeap = new BinaryHeapImpl<>();
        
        //insere todos os elementos do array de entrada na Min-Heap
        //a cada inserção, a heap se reorganiza para manter o menor 
        //elemento na raiz da arvore
        for(T element : array) minHeap.insert(element);
        //novo array para o resultado ordenado
        T[] arrayOrdenado = =(T[]) Array.newInstance(array.getClass().getComponentType, array.length);
        //extrai os elementos da heap e preenche o array de resultado
        for(int i=0;i<array.length;i++)arrayOrdenado[i]=minHeap.extractRootElement();
        //como estamos usando uma min-heap, o extractRootElement() smepre retornará o menor elemento restante na heap
        return arrayOrdenado;
        //se fosse uam questão para obter em ordem decrescente, mudaria apenas
        //o extractRootElement() no último for, para o método correspondente me BinaryHeapImpl.java
    }

    @Override
    public boolean isMinHeap(T[] array) {
        // TODO: Implemente a validação da Min-Heap aqui.
        return false;
    }


    //Estatística de Ordem:
    @Override
    public T[] findKLargest(T[] array, int k) {
        // TODO: Implemente a busca pelos K maiores elementos aqui.
        // Dica: Use uma Min-Heap de tamanho 'k'. Ao iterar pelo array,
        // se um elemento for maior que a raiz da heap, remova a raiz
        // e insira o novo elemento. No final, a heap conterá os k maiores.
        return null;
    }
}