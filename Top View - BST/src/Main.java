import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Criando a árvore de teste
        BST<Integer> tree = new BSTImpl<>();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(3);
        tree.insert(8);
        tree.insert(15);
        tree.insert(25);
        tree.insert(2);

        /*
              A árvore resultante:
                     10
                   /    \
                  5      20
                 / \    /  \
                3   8  15  25
               /
              2
        */

        // 2. Criando uma instância da sua classe
        MyTraversal<Integer> manipulator = new MyTraversal<>();

        // 3. Chamando seu método para ver o que ele produz
        System.out.println("--- Executando sua lógica de travessia de bordas ---");
        List<Integer> edgeResult = manipulator.getEdges(tree);
        
        System.out.println("Resultado da sua travessia: " + edgeResult);
        
        // Vamos prever o que sua lógica deve imprimir:
        // Caminho esquerdo: 10, 5, 3, 2
        // Caminho direito: 20, 25
        System.out.println("Resultado esperado pela sua lógica: [10, 5, 3, 2, 20, 25]");
        System.out.println("-----------------------------------------------------");
    }
}