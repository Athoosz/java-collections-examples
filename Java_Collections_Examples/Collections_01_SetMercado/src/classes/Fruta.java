package classes;

public class Fruta implements Comparable<Fruta> {
  private String nome;
  private double preco;
  
  public Fruta(String nome, double preco) {
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
  public int compareTo(Fruta o) {
    return this.nome.compareTo(o.nome);
  }

  @Override
  public String toString() {
    return "Fruta: " + nome + " - R$" + preco;
  }
  
}
