# 📚 Estruturas de Dados - Listas Encadeadas em Java
Este projeto implementa três tipos de listas encadeadas em Java, desenvolvido como trabalho acadêmico para a disciplina de Estrutura de Dados.

# 🏗️ Estruturas Implementadas
# 1. Lista Encadeada Simples
Características: Nós com ponteiro apenas para o próximo elemento

# 2. Lista Duplamente Encadeada
Características: Nós com ponteiros para anterior e próximo

Vantagens: Navegação bidirecional

Complexidade: Similar à lista simples, mas com melhor navegação

# 3. Lista Encadeada Circular
Características: Último nó aponta para o primeiro, formando um ciclo

Aplicações: Sistemas de rodízio, buffers circulares

# 🚀 Como Executar
Pré-requisitos
Java JDK 8 ou superior

Eclipse IDE (recomendado) ou qualquer editor de texto

No Eclipse:
Clone o repositório

Importe o projeto no Eclipse: File → Import → Existing Projects into Workspace

Execute o arquivo Main.java

Linha de Comando:
bash
# Compilar
javac -d bin src/*.java src/listaSimples/*.java src/listaDupla/*.java src/listaCircular/*.java

# Executar
java -cp bin Main
💻 Exemplos de Uso
Lista Simples
java
ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
lista.inserirInicio(10);
lista.inserirFim(20);
lista.listar(); // Saída: 10 -> 20 -> NULL
Lista Dupla
java
ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
lista.inserirInicio(15);
lista.inserirFim(25);
lista.listarInicioFim();  // 15 ⇄ 25 ⇄ NULL
lista.listarFimInicio();  // 25 ⇄ 15 ⇄ NULL
Lista Circular
java
ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
lista.inserirInicio(5);
lista.inserirFim(10);
lista.listar(); // Saída: 5 → 10 → (volta ao início)
🛠️ Operações Implementadas
Cada lista implementa as seguintes operações:

✅ Inserção: no início, fim e meio

✅ Busca: localizar elemento por valor

✅ Remoção: remover elemento específico

✅ Listagem: exibir todos os elementos

✅ Tamanho: retornar quantidade de elementos

📊 Saída do Programa
text
=== COMPARAÇÃO DE ESTRUTURAS DE DADOS ===

1. LISTA ENCADEADA SIMPLES
Lista Simples: 5 -> 10 -> 20 -> NULL
Tamanho: 3

2. LISTA DUPLAMENTE ENCADEADA
Lista Dupla (Início→Fim): 8 ⇄ 15 ⇄ 25 ⇄ NULL
Lista Dupla (Fim→Início): 25 ⇄ 15 ⇄ 8 ⇄ NULL
Tamanho: 3

3. LISTA ENCADEADA CIRCULAR
Lista Circular: 7 → 12 → 18 → (volta ao início)
Tamanho: 3

# 👨‍💻 Desenvolvimento
Tecnologias Utilizadas
Linguagem: Java

Estruturas: Nós (Nodes) e referências

Princípios Aplicados
Encapsulamento

Reutilização de código

Código comentado e legível

