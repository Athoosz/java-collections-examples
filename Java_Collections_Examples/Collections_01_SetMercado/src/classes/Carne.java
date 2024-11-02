package classes;

public class Carne implements Comparable<Carne> {
  private String nome;
  private double preco;

  public Carne(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public int compareTo(Carne o) {
    return this.nome.compareTo(o.nome);
  }

  @Override
  public String toString() {
    return "Carne: " + nome + " - R$" + preco;
  }
}
