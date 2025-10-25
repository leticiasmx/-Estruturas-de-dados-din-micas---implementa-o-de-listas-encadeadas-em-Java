package ListaSimples;

public class ListaEncadeadaSimples {
    private Node inicio;
    private int tamanho;
    
    public ListaEncadeadaSimples() {
        this.inicio = null;
        this.tamanho = 0;
    }
    
    // Inserir no início
    public void inserirInicio(int valor) {
        Node novoNode = new Node(valor);
        novoNode.next = inicio;
        inicio = novoNode;
        tamanho++;
        System.out.println("Inserido " + valor + " no início");
    }
    
    // Inserir no fim
    public void inserirFim(int valor) {
        Node novoNode = new Node(valor);
        
        if (inicio == null) {
            inicio = novoNode;
        } else {
            Node atual = inicio;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novoNode;
        }
        tamanho++;
        System.out.println("Inserido " + valor + " no fim");
    }
    
    // Buscar elemento
    public boolean buscar(int valor) {
        Node atual = inicio;
        while (atual != null) {
            if (atual.data == valor) {
                return true;
            }
            atual = atual.next;
        }
        return false;
    }
    
    // Remover elemento
    public void remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        if (inicio.data == valor) {
            inicio = inicio.next;
            tamanho--;
            System.out.println("Removido " + valor);
            return;
        }
        
        Node atual = inicio;
        while (atual.next != null && atual.next.data != valor) {
            atual = atual.next;
        }
        
        if (atual.next != null) {
            atual.next = atual.next.next;
            tamanho--;
            System.out.println("Removido " + valor);
        } else {
            System.out.println("Valor " + valor + " não encontrado");
        }
    }
    
    // Listar todos os elementos
    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        Node atual = inicio;
        System.out.print("Lista: ");
        
        while (atual != null) {
            System.out.print(atual.data + " -> ");
            atual = atual.next;
        }
        System.out.println("NULL");
    }
    
    // Mostrar tamanho
    public int getTamanho() {
        return tamanho;
    }
}
