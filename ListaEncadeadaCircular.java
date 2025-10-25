package ListaCircular;

public class ListaEncadeadaCircular {
    private NodeCircular ultimo;
    private int tamanho;
    
    public ListaEncadeadaCircular() {
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    // Inserir no início (após o último)
    public void inserirInicio(int valor) {
        NodeCircular novoNode = new NodeCircular(valor);
        
        if (ultimo == null) {
            // Lista vazia - o nó aponta para si mesmo
            ultimo = novoNode;
            novoNode.next = novoNode;
        } else {
            // Insere após o último (que é o início)
            novoNode.next = ultimo.next;
            ultimo.next = novoNode;
        }
        tamanho++;
        System.out.println("Inserido " + valor + " no início");
    }
    
    // Inserir no fim (torna-se o novo último)
    public void inserirFim(int valor) {
        NodeCircular novoNode = new NodeCircular(valor);
        
        if (ultimo == null) {
            ultimo = novoNode;
            novoNode.next = novoNode;
        } else {
            novoNode.next = ultimo.next;
            ultimo.next = novoNode;
            ultimo = novoNode; // Atualiza o último
        }
        tamanho++;
        System.out.println("Inserido " + valor + " no fim");
    }
    
    // Buscar elemento
    public boolean buscar(int valor) {
        if (ultimo == null) return false;
        
        NodeCircular atual = ultimo.next; // Começa do primeiro
        NodeCircular primeiro = atual;
        
        do {
            if (atual.data == valor) {
                return true;
            }
            atual = atual.next;
        } while (atual != primeiro);
        
        return false;
    }
    
    // Remover elemento
    public void remover(int valor) {
        if (ultimo == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeCircular atual = ultimo.next; // Primeiro
        NodeCircular anterior = ultimo;
        
        // Encontrar o elemento
        do {
            if (atual.data == valor) {
                // Ajustar ponteiros
                anterior.next = atual.next;
                
                // Se era o único elemento
                if (atual == atual.next) {
                    ultimo = null;
                }
                // Se era o último
                else if (atual == ultimo) {
                    ultimo = anterior;
                }
                
                tamanho--;
                System.out.println("Removido " + valor);
                return;
            }
            anterior = atual;
            atual = atual.next;
        } while (atual != ultimo.next);
        
        System.out.println("Valor " + valor + " não encontrado");
    }
    
    // Listar todos os elementos
    public void listar() {
        if (ultimo == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeCircular atual = ultimo.next; // Primeiro elemento
        NodeCircular primeiro = atual;
        
        System.out.print("Lista Circular: ");
        
        do {
            System.out.print(atual.data + " → ");
            atual = atual.next;
        } while (atual != primeiro);
        
        System.out.println("(volta ao início)");
    }
    
    public int getTamanho() {
        return tamanho;
    }
}
