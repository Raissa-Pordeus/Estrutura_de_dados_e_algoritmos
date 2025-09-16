import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Criando a árvore original
        BST<Integer> tree = new BSTImpl<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(20);

        // Para visualizar a árvore, podemos "imprimir" o percurso em-ordem
        // (que para uma BST resulta nos elementos ordenados)
        System.out.println("Percurso em-ordem da árvore ORIGINAL: " + Arrays.toString(tree.order()));
        // Resultado esperado: [3, 5, 10, 15, 20]

        // 2. Criando uma instância da sua classe de manipulação
        BSTManipulation<Integer> manipulator = new BSTManipulationImpl<>();

        // 3. Espelhando a árvore
        System.out.println("\n--- Espelhando a árvore ---");
        BST<Integer> mirroredTree = manipulator.mirror(tree);
        
        // 4. Verificando a árvore espelhada
        System.out.println("Percurso em-ordem da árvore ESPELHADA: " + Arrays.toString(mirroredTree.order()));
        // O percurso em-ordem da árvore espelhada deve ser a ordem inversa da original!
        System.out.println("Resultado esperado: [20, 15, 10, 5, 3]");
        System.out.println("----------------------------");
    }
}