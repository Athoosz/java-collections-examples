# Collections_02_MapJogador

## Descrição

Este projeto é um exemplo de uso de coleções em Java, especificamente `Map`, para gerenciar os gols marcados por um jogador de futebol em diferentes times. O projeto demonstra como utilizar `HashMap` para armazenar e exibir a quantidade de gols marcados por um jogador em cada time.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:


### Arquivos Principais

- `src/App.java`: Contém o ponto de entrada do programa. Demonstra a criação de um jogador de futebol e a adição de gols marcados por ele em diferentes times.
- `src/classes/JogadorFutebol.java`: Define a classe `JogadorFutebol`, que gerencia os gols marcados por um jogador utilizando um `HashMap`.

## Funcionalidades

### App.java

O arquivo `App.java` contém o método `main` que executa o seguinte:

1. Cria um objeto `JogadorFutebol` com o nome "Deyverson" e idade 33.
2. Adiciona a quantidade de gols marcados pelo jogador em diferentes times utilizando o método `adicionarGolsPorTime`.
3. Exibe a quantidade de gols marcados pelo jogador em cada time utilizando o método `exibirGolsPorTime`.

### JogadorFutebol.java

A classe `JogadorFutebol` representa um jogador de futebol e gerencia os gols marcados por ele em diferentes times. Ela utiliza um `HashMap` para armazenar a quantidade de gols marcados em cada time.

#### Métodos Principais

- `adicionarGolsPorTime(String time, int gols)`: Adiciona a quantidade de gols marcados pelo jogador em um time específico.
- `exibirGolsPorTime()`: Exibe a quantidade de gols marcados pelo jogador em cada time.

## Como Executar

Para compilar e executar o projeto, siga os passos abaixo:

1. Navegue até o diretório `Collections_02_MapJogador`.
2. Compile os arquivos Java:
    ```sh
    javac -d bin src/classes/*.java src/App.java
    ```
3. Execute o programa:
    ```sh
    java -cp bin App
    ```

## Conclusão

Este projeto é um exemplo simples de como utilizar coleções em Java para gerenciar os gols marcados por um jogador de futebol em diferentes times. Ele demonstra o uso de `HashMap` para armazenar e exibir a quantidade de gols marcados por um jogador em cada time.