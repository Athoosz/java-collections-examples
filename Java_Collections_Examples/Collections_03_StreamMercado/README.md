# Collections_03_StreamMercado

## Descrição

Este projeto é um exemplo de uso de coleções e streams em Java para gerenciar um estoque de produtos. O projeto demonstra como utilizar `ArrayList` e operações de stream para adicionar, buscar, remover e ordenar produtos no estoque.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:


### Arquivos Principais

- `src/App.java`: Contém o ponto de entrada do programa. Demonstra a criação de um estoque de produtos e a execução de várias operações utilizando streams.
- `src/classes/Alimento.java`: Define a classe `Alimento`, que representa um tipo de produto alimentício.
- `src/classes/Eletronico.java`: Define a classe `Eletronico`, que representa um tipo de produto eletrônico.
- `src/classes/Estoque.java`: Define a classe `Estoque`, que gerencia uma lista de produtos e fornece métodos para operações de estoque.

## Funcionalidades

### App.java

O arquivo `App.java` contém o método `main` que executa o seguinte:

1. Cria um objeto `Estoque`.
2. Adiciona vários produtos ao estoque, incluindo alimentos e eletrônicos.
3. Calcula e exibe a quantidade total de produtos no estoque.
4. Calcula e exibe o valor médio dos produtos no estoque.
5. Busca e exibe um produto específico pelo nome.
6. Busca e exibe produtos com preço maior que 10.
7. Remove um produto específico do estoque.
8. Ordena e exibe os produtos por preço.
9. Ordena e exibe os produtos por nome.

### Alimento.java

A classe `Alimento` representa um produto alimentício e contém informações como nome, preço, quantidade, data de fabricação e data de validade.

### Eletronico.java

A classe `Eletronico` representa um produto eletrônico e contém informações como nome, preço, quantidade, data de fabricação e garantia.

### Estoque.java

A classe `Estoque` gerencia uma lista de produtos e fornece métodos para adicionar, buscar, remover e ordenar produtos. Ela utiliza operações de stream para realizar essas operações de forma eficiente.

#### Métodos Principais

- `adicionarProduto(Produto produto)`: Adiciona um produto ao estoque.
- `calcularQuantidadeTotal()`: Calcula a quantidade total de produtos no estoque.
- `calcularValorMedia()`: Calcula o valor médio dos produtos no estoque.
- `buscarProdutoPorNome(String nome)`: Busca um produto específico pelo nome.
- `buscarProdutosMaiorQue10()`: Busca produtos com preço maior que 10.
- `removerProduto(Produto produto)`: Remove um produto específico do estoque.
- `ordenarProdutosPorPreco()`: Ordena os produtos por preço.
- `ordenarProdutosPorNome()`: Ordena os produtos por nome.

## Como Executar

Para compilar e executar o projeto, siga os passos abaixo:

1. Navegue até o diretório `Collections_03_StreamMercado`.
2. Compile os arquivos Java:
    ```sh
    javac -d bin src/classes/*.java src/App.java
    ```
3. Execute o programa:
    ```sh
    java -cp bin App
    ```

## Conclusão

Este projeto é um exemplo simples de como utilizar coleções e streams em Java para gerenciar um estoque de produtos. Ele demonstra o uso de `ArrayList` e operações de stream para adicionar, buscar, remover e ordenar produtos no estoque.