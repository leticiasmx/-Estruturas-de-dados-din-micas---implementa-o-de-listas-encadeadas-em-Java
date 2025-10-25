package ListaDupla;

public class ListaDuplamenteEncadeada {
    private NodeDuplo inicio;
    private NodeDuplo fim;
    private int tamanho;
    
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public void inserirInicio(int valor) {
        NodeDuplo novoNode = new NodeDuplo(valor);
        
        if (inicio == null) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            novoNode.next = inicio;
            inicio.previous = novoNode;
            inicio = novoNode;
        }
        tamanho++;
        System.out.println("Inserido " + valor + " no início");
    }
    
    public void inserirFim(int valor) {
        NodeDuplo novoNode = new NodeDuplo(valor);
        
        if (fim == null) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            fim.next = novoNode;
            novoNode.previous = fim;
            fim = novoNode;
        }
        tamanho++;
        System.out.println("Inserido " + valor + " no fim");
    }
    
    public boolean buscar(int valor) {
        NodeDuplo atual = inicio;
        while (atual != null) {
            if (atual.data == valor) {
                return true;
            }
            atual = atual.next;
        }
        return false;
    }
    
    public void remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeDuplo atual = inicio;
        while (atual != null && atual.data != valor) {
            atual = atual.next;
        }
        
        if (atual == null) {
            System.out.println("Valor " + valor + " não encontrado");
            return;
        }
        
        if (atual.previous != null) {
            atual.previous.next = atual.next;
        } else {
            inicio = atual.next;
        }
        
        if (atual.next != null) {
            atual.next.previous = atual.previous;
        } else {
            fim = atual.previous;
        }
        
        tamanho--;
        System.out.println("Removido " + valor);
    }
    
    public void listarInicioFim() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeDuplo atual = inicio;
        System.out.print("Lista Dupla (Início→Fim): ");
        
        while (atual != null) {
            System.out.print(atual.data + " ⇄ ");
            atual = atual.next;
        }
        System.out.println("NULL");
    }
    
    public void listarFimInicio() {
        if (fim == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeDuplo atual = fim;
        System.out.print("Lista Dupla (Fim→Início): ");
        
        while (atual != null) {
            System.out.print(atual.data + " ⇄ ");
            atual = atual.previous;
        }
        System.out.println("NULL");
    }
    
    public int getTamanho() {
        return tamanho;
    }
}
