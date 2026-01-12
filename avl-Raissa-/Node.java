public class Node {
    private int valor, altura;

    private Node esquerda, direita, pai;


    public Node(int valor) {
    this.valor = valor;
    this.altura = 0; // Todo nó novo começa como folha (altura 0)
    this.esquerda = null;
    this.direita = null;
    }

    //calculo da altura de um nó com recursividade
    public int altura(Node node) {
        if(node ==null) return -1;
        return 1 + Math.max(altura(node.esquerda), altura(node.direita));
    }

    //calculo do balance de um nó (diferença entre a altura da sub-árvore 
    //à esquerda e a altura da sub-árvore à direita.)
    private int balance(Node node) {
    if (node != null) return altura(node.esquerda) - altura(node.direita);
        return 0;
    }


    public boolean isLeftPending(){
        if ((altura(this.esquerda) - altura(this.direita)) == 1)  return true;
        return false;
    }


    public boolean isRightPending(){
        if ((altura(this.esquerda) - altura(this.direita)) == -1)  return true;
        return false;
    }
    public boolean isBalanced(){
        int fb = (altura(this.esquerda) - altura(this.direita));
        if (fb == 2 || fb == -2)  return false;
        return true;
    }
    public boolean isNiveladed(){
        if ((altura(this.esquerda) - altura(this.direita)) == 0)  return true;
        return false;
    }

    public Node rotDir(Node node){
        return null;
    }
    public Node rotEsq(Node node){
        return null;
    }

    private Node rebalancear(Node atual) {
        int fb = balance(atual); // Calcula a diferença (esquerda - direita)

        // Caso 1: Pendente para a Esquerda (FB > 1)
        if (fb >1) {//==2
            // Verifica se é LR (Joelho)
            if (balance(atual.esquerda) < 0) {
                System.out.println("rot_esq(" + atual.esquerda.valor + ")");
                atual.esquerda = rotEsq(atual.esquerda);
            }
            else if (balance(atual.esquerda) >= 0){
                System.out.println("rot_dir(" + atual.valor + ")");
            }
            return rotDir(atual);
        }

        // Caso 2: Pendente para a Direita (FB < -1)
        if (fb < -1) {//==-2
            // Verifica se é RL (Joelho)
            if (balance(atual.direita) > 0) {
                System.out.println("rot_dir(" + atual.direita.valor + ")");
                atual.direita = rotDir(atual.direita);
            }
            System.out.println("rot_esq(" + atual.valor + ")");
            return rotEsq(atual);
        }

        return atual; // Se estiver balanceado, retorna o próprio nó
    }

    public static void main(String[] args) {
    System.out.println("Testando minha árvore AVL!");
    // Seu código de teste aqui
    }


    public Node inserir(Node atual, int valor) {
        if (atual == null) {
            return new Node(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = inserir(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserir(atual.direita, valor);
        } else {
            return atual;
        }
        atual.altura = 1 + Math.max(altura(atual.esquerda), altura(atual.direita));
        return rebalancear(atual);
    }
}