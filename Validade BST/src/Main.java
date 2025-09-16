import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BSTManipulationInOrder<Integer> manipulator = new BSTManipulationInOrderImpl<>();

        // --- Teste 1: Árvore VÁLIDA ---
        System.out.println("--- Testando uma BST VÁLIDA ---");
        BST<Integer> validTree = new BSTImpl<>();
        validTree.insert(20);
        validTree.insert(10);
        validTree.insert(30);
        validTree.insert(5);
        validTree.insert(15);
        System.out.println("A árvore é uma BST válida? " + manipulator.isValidBST(validTree));
        System.out.println("Resultado esperado: true\n");

        // --- Teste 2: Árvore INVÁLIDA ---
System.out.println("--- Testando uma BST INVÁLIDA ---");
BST<Integer> invalidTree = new BSTImpl<>();
BSTNode<Integer> root = invalidTree.getRoot();
root.setData(20);

BSTNode<Integer> invalidLeftChild = new BSTNode<>();
invalidLeftChild.setData(30);
// **CORREÇÃO AQUI: Adiciona filhos vazios**
invalidLeftChild.setLeft(new BSTNode<>());
invalidLeftChild.setRight(new BSTNode<>());

BSTNode<Integer> rightChild = new BSTNode<>();
rightChild.setData(10);
// **E AQUI TAMBÉM**
rightChild.setLeft(new BSTNode<>());
rightChild.setRight(new BSTNode<>());

root.setLeft(invalidLeftChild);
root.setRight(rightChild);

System.out.println("A árvore é uma BST válida? " + manipulator.isValidBST(invalidTree));
System.out.println("Resultado esperado: false\n");
        
        // --- Teste 3: Árvore INVÁLIDA em um nível mais profundo ---
        System.out.println("--- Testando outra BST INVÁLIDA ---");
        BST<Integer> invalidTree2 = new BSTImpl<>();
        invalidTree2.insert(20);
        invalidTree2.insert(10);
        
        // Forçando um nó inválido na sub-árvore direita do nó 10
        BSTNode<Integer> node10 = invalidTree2.search(10);
        BSTNode<Integer> invalidNode = new BSTNode<>();
        invalidNode.setData(25); // Inválido! (25 > 10, mas 10 está na sub-árvore esquerda de 20)
        
        // Precisamos criar filhos vazios para o nó inválido também
        invalidNode.setLeft(new BSTNode<>());
        invalidNode.setRight(new BSTNode<>());

        node10.setRight(invalidNode);

        System.out.println("A árvore é uma BST válida? " + manipulator.isValidBST(invalidTree2));
        System.out.println("Resultado esperado: false\n");
    }
}