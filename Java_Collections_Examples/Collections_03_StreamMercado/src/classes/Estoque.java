package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque {

  private List<Produto> produtos;

  public Estoque() {
    this.produtos = new ArrayList<>();
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  public void adicionarProduto(Produto produto) {
    produtos.add(produto);
  }

  public void removerProduto(Produto produto) {
    produtos.remove(produto);
  }

  public List<Produto> ordenarProdutosPorNome() {
    return produtos.stream()
        .sorted((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()))
        .collect(Collectors.toList());
  }

  public List<Produto> ordenarProdutosPorPreco() {
    return produtos.stream()
        .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
        .collect(Collectors.toList());
  }

  public double calcularValorMedia() {
    return produtos.stream().mapToDouble(Produto::getPreco).average().orElse(0.0);
  }

  public int calcularQuantidadeTotal() {
    return produtos.stream().mapToInt(Produto::getQuantidade).sum();
  }

  public Produto buscarProdutoPorNome(String nome) {
    return produtos.stream()
        .filter(p -> p.getNome().equalsIgnoreCase(nome))
        .findFirst()
        .orElse(null);
  }

  public List<Produto> buscarProdutosMaiorQue10() {
    return produtos.stream().filter(p -> p.getPreco() > 10).collect(Collectors.toList());
  }

  @Override
  public String toString() {
    return "Estoque Produtos:" + produtos + "\n";
  }
}