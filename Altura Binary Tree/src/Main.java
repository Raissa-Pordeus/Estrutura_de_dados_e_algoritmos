import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Criando a árvore de teste
        BST<Integer> tree = new BSTImpl<>();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(40);
        tree.insert(5);
        tree.insert(15);
        tree.insert(35);

        /*
              A árvore resultante será:
                     20
                   /    \
                  10      30
                 /  \       \
                5   15       40
                          /
                         35
        */

        // 2. Criando uma instância da sua classe de manipulação
        BSTManipulationPostOrder<Integer> manipulator = new BSTManipulationPostOrderImpl<>();

        // 3. Calculando a altura
        System.out.println("--- Calculando a altura da árvore ---");
        int treeHeight = manipulator.height(tree);
        
        System.out.println("A altura da árvore é: " + treeHeight);
        System.out.println("Resultado esperado: 3"); // O caminho mais longo é 20 -> 30 -> 40 -> 35
        System.out.println("------------------------------------");

        // Teste com árvore vazia
        BST<Integer> emptyTree = new BSTImpl<>();
        int emptyHeight = manipulator.height(emptyTree);
        System.out.println("A altura da árvore vazia é: " + emptyHeight);
        System.out.println("Resultado esperado: -1");
        System.out.println("------------------------------------");
        
        // Teste com árvore com um único nó
        BST<Integer> singleNodeTree = new BSTImpl<>();
        singleNodeTree.insert(100);
        int singleNodeHeight = manipulator.height(singleNodeTree);
        System.out.println("A altura da árvore com um nó é: " + singleNodeHeight);
        System.out.println("Resultado esperado: 0");
        System.out.println("------------------------------------");
    }
}