import ListaSimples.ListaEncadeadaSimples;
import ListaDupla.ListaDuplamenteEncadeada;
import ListaCircular.ListaEncadeadaCircular;

public class Main {
    public static void main(String[] args) {
        System.out.println("COMPARAÇÃO DE ESTRUTURAS DE DADOS\n");
        
        // Testar Lista Simples
        System.out.println("1. LISTA ENCADEADA SIMPLES");
        ListaEncadeadaSimples listaSimples = new ListaEncadeadaSimples();
        listaSimples.inserirInicio(10);
        listaSimples.inserirFim(20);
        listaSimples.inserirInicio(5);
        listaSimples.listar();
        System.out.println("Tamanho: " + listaSimples.getTamanho() + "\n");
        
        // Testar Lista Dupla
        System.out.println("2. LISTA DUPLAMENTE ENCADEADA");
        ListaDuplamenteEncadeada listaDupla = new ListaDuplamenteEncadeada();
        listaDupla.inserirInicio(15);
        listaDupla.inserirFim(25);
        listaDupla.inserirInicio(8);
        listaDupla.listarInicioFim();
        listaDupla.listarFimInicio();
        System.out.println("Tamanho: " + listaDupla.getTamanho() + "\n");
        
        // Testar Lista Circular
        System.out.println("3. LISTA ENCADEADA CIRCULAR");
        ListaEncadeadaCircular listaCircular = new ListaEncadeadaCircular();
        listaCircular.inserirInicio(12);
        listaCircular.inserirFim(18);
        listaCircular.inserirInicio(7);
        listaCircular.listar();
        System.out.println("Tamanho: " + listaCircular.getTamanho() + "\n");
        
        // Testar buscas
        System.out.println("Buscar 20 na lista simples: " + listaSimples.buscar(20));
        System.out.println("Buscar 25 na lista dupla: " + listaDupla.buscar(25));
        System.out.println("Buscar 18 na lista circular: " + listaCircular.buscar(18));
    }
}
