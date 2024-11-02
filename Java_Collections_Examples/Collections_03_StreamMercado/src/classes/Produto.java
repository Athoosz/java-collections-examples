package classes;

import java.time.LocalDate;

public abstract class Produto {

  private static final int MAX_ESTOQUE = 1000;
  private String nome;
  private double preco;
  private int quantidade;
  private LocalDate dataDeFabricacao;

  public Produto(String nome, double preco, int quantidade, LocalDate dataDeFabricacao) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
    this.dataDeFabricacao = dataDeFabricacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if(nome != null && !nome.isEmpty()) {
      this.nome = nome;
    }
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    // Não vendemos nada de graça rs
    if (preco > 0) {
      this.preco = preco;
    }
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    if (quantidade >= 0 && quantidade <= MAX_ESTOQUE) {
      this.quantidade = quantidade;
    }
  }

  public LocalDate getdataDeFabricacao() {
    return dataDeFabricacao;
  }

  public void setdataDeFabricacao(LocalDate dataDeFabricacao) {
    this.dataDeFabricacao = dataDeFabricacao;
  }

  @Override
  public String toString() {
    return "\nNome:" + nome + ", Preco:" + preco + ", Quantidade:" + quantidade + ", DataDeFabricacao:"
        + dataDeFabricacao;
  }
}