import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Criando uma instância da sua classe de manipulação
        HeapManipulationExtended<Integer> manipulator = new HeapManipulationExtendedImpl<>();

        // Testes anteriores (heapsort e isMinHeap)...
        System.out.println("--- Teste Heapsort ---");
        Integer[] arrayToSort = {5, 2, 8, 12, 1, 9, 4, 6};
        Integer[] sortedArray = manipulator.heapsort(arrayToSort);
        System.out.println("Array ordenado: " + Arrays.toString(sortedArray));
        System.out.println("Resultado esperado: [1, 2, 4, 5, 6, 8, 9, 12]\n");

        System.out.println("--- Teste isMinHeap ---");
        Integer[] validMinHeap = {2, 5, 4, 12, 6, 9, 8};
        boolean result1 = manipulator.isMinHeap(validMinHeap);
        System.out.println("O array " + Arrays.toString(validMinHeap) + " é uma Min-Heap? " + result1);
        System.out.println("Resultado esperado: true\n");
        
        Integer[] invalidMinHeap = {3, 8, 10, 9, 7};
        boolean result2 = manipulator.isMinHeap(invalidMinHeap);
        System.out.println("O array " + Arrays.toString(invalidMinHeap) + " é uma Min-Heap? " + result2);
        System.out.println("Resultado esperado: false\n");

        // 3. Testando o NOVO método de Estatística de Ordem
        System.out.println("--- Teste findKLargest ---");
        Integer[] data = {10, 50, 2, 80, 45, 95, 15, 60};
        int k = 3;
        System.out.println("Array original: " + Arrays.toString(data));
        System.out.println("Encontrando os " + k + " maiores elementos...");

        Integer[] kLargest = manipulator.findKLargest(data, k);
        
        // O resultado não precisa estar ordenado, então vamos ordená-lo para facilitar a verificação
        if (kLargest != null) {
            Arrays.sort(kLargest);
        }
        
        System.out.println("Maiores elementos encontrados (ordenado): " + Arrays.toString(kLargest));
        System.out.println("Resultado esperado: [60, 80, 95]");
        System.out.println("--------------------------");
    }
}