public class Main {
    public static void main(String[] args) {
        // 1. Criando a árvore de teste
        BST<Integer> tree = new BSTImpl<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.insert(35); // Adicionando um nó para quebrar a "árvore cheia"

        /*
              A árvore resultante será:
                     50
                   /    \
                  30      70
                 /  \    /  \
                20  40  60  80
                   /
                  35
        */

        // 2. Criando uma instância da sua classe de manipulação
        ExtendedBSTManipulation<Integer> manipulator = new ExtendedBSTManipulationImpl<>();

        // 3. Testando o método countNodesInRange
        System.out.println("--- Teste countNodesInRange ---");
        // Deve contar os nós: 30, 35, 40, 50, 60
        int count = manipulator.countNodesInRange(tree, 30, 65);
        System.out.println("Nós entre 30 e 65: " + count); // Resposta esperada: 5
        System.out.println("-----------------------------");


        // 4. Testando o método isFullBinaryTree
        System.out.println("\n--- Teste isFullBinaryTree ---");
        boolean isFull = manipulator.isFullBinaryTree(tree);
        System.out.println("A árvore é 'cheia'? " + isFull); // Resposta esperada: false (por causa do nó 40)
        System.out.println("-----------------------------");

        // Teste extra com uma árvore cheia
        BST<Integer> fullTree = new BSTImpl<>();
        fullTree.insert(10);
        fullTree.insert(5);
        fullTree.insert(15);
        boolean isFull2 = manipulator.isFullBinaryTree(fullTree);
        System.out.println("A segunda árvore é 'cheia'? " + isFull2); // Resposta esperada: true
    }
}