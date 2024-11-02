# Collections_01_SetMercado

## Descrição

Este projeto é um exemplo de uso de coleções em Java, especificamente `Set`, para gerenciar um mercado. O projeto demonstra como utilizar `LinkedHashSet` e `TreeSet` para armazenar e ordenar produtos de diferentes tipos, como frutas e carnes.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:


### Arquivos Principais

- `src/App.java`: Contém o ponto de entrada do programa. Demonstra a criação de dois carrinhos de compras utilizando `LinkedHashSet` e `TreeSet`.
- `src/classes/Carne.java`: Define a classe `Carne`, que implementa a interface `Comparable` para permitir a ordenação.
- `src/classes/Fruta.java`: Define a classe `Fruta`, que também implementa a interface `Comparable`.
- `src/classes/Mercado.java`: Define a classe genérica `Mercado` que gerencia um conjunto de produtos.

## Funcionalidades

### App.java

O arquivo `App.java` contém o método `main` que executa o seguinte:

1. Cria um carrinho de compras utilizando `LinkedHashSet`, que mantém a ordem de inserção dos produtos.
2. Adiciona três frutas ao carrinho de compras.
3. Cria um segundo carrinho de compras utilizando `TreeSet`, que ordena os produtos em ordem alfabética.
4. Adiciona três tipos de carne ao segundo carrinho de compras.
5. Exibe o conteúdo de ambos os carrinhos de compras no console.

### Carne.java

A classe `Carne` representa um tipo de produto e implementa a interface `Comparable` para permitir a ordenação por nome.

### Fruta.java

A classe `Fruta` representa outro tipo de produto e também implementa a interface `Comparable` para permitir a ordenação por nome.

### Mercado.java

A classe `Mercado` é uma classe genérica que gerencia um conjunto de produtos. Ela pode utilizar tanto `LinkedHashSet` quanto `TreeSet` para armazenar os produtos, dependendo do parâmetro passado no construtor.

## Como Executar

Para compilar e executar o projeto, siga os passos abaixo:

1. Navegue até o diretório `Collections_01_SetMercado`.
2. Compile os arquivos Java:
    ```sh
    javac -d bin src/classes/*.java src/App.java
    ```
3. Execute o programa:
    ```sh
    java -cp bin App
    ```

## Conclusão

Este projeto é um exemplo simples de como utilizar coleções em Java para gerenciar um mercado. Ele demonstra o uso de `LinkedHashSet` e `TreeSet` para armazenar e ordenar produtos de diferentes tipos.