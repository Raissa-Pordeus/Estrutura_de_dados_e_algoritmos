import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Uma implementação de Min-Heap (Heap Mínima).
 * A raiz é sempre o menor elemento.
 */
public class BinaryHeapImpl<T extends Comparable<T>> {

    private ArrayList<T> heap;

    public BinaryHeapImpl() {
        this.heap = new ArrayList<>();
    }

    public void insert(T element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    public T extractRootElement() {
        if (isEmpty()) {
            return null;
        }
        T root = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastElement);
            siftDown(0);
        }
        return root;
    }

    public T getRootElement() {
        return isEmpty() ? null : heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void buildHeap(T[] array) {
        this.heap = new ArrayList<>(Arrays.asList(array));
        for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
            siftDown(i);
        }
    }
    
    // Métodos auxiliares privados
    private void siftUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
            Collections.swap(heap, index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void siftDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;

        if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(heap.get(smallest)) < 0) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < heap.size() && heap.get(rightChildIndex).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            Collections.swap(heap, index, smallest);
            siftDown(smallest);
        }
    }
}