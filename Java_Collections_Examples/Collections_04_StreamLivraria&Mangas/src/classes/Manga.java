package classes;

public class Manga {
  private String nome;
  private double preco;

  public Manga(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + " | Preço: " + preco + "\n";
  }
}
