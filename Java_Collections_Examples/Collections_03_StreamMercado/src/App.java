import java.time.LocalDate;

import classes.Alimento;
import classes.Eletronico;
import classes.Estoque;

public class App {
  public static void main(String[] args) throws Exception {

    Estoque estoque = new Estoque();

    estoque.adicionarProduto(new Alimento("Maça", 5.0, 25, LocalDate.now(), LocalDate.now().plusDays(30)));
    estoque.adicionarProduto(new Alimento("Pera", 6.0, 20, LocalDate.now(), LocalDate.now().plusDays(30)));
    estoque.adicionarProduto(new Alimento("Banana", 7.0, 30, LocalDate.now(), LocalDate.now().plusDays(30)));
    estoque.adicionarProduto(new Eletronico("Tv", 1000.0, 1, LocalDate.now(), 12));
    estoque.adicionarProduto(new Eletronico("Computador", 3000.0, 1, LocalDate.now(), 12));
    estoque.adicionarProduto(new Eletronico("Celular", 2000.0, 1, LocalDate.now(), 12));

    System.out.println("\nQuantidade total: " + estoque.calcularQuantidadeTotal());

    System.out.println("\nValor médio: " + estoque.calcularValorMedia());
    
    System.out.println("\nProduto buscado: " + estoque.buscarProdutoPorNome("Maça"));
   
    System.out.println("\nProdutos com preço maior que 10: " + estoque.buscarProdutosMaiorQue10());

    estoque.removerProduto(estoque.buscarProdutoPorNome("Maça"));

    System.out.println("\nProdutos ordenados por preço: " + estoque.ordenarProdutosPorPreco());

    System.out.println("\nProdutos ordenados por nome: " + estoque.ordenarProdutosPorNome() + "\n");
  } 
}
