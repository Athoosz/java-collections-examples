package classes;

import java.time.LocalDate;

public class Alimento extends Produto {

  private LocalDate dataDeValidade;

  public Alimento(String nome, double preco, int quantidade, LocalDate dataDeFabricacao, LocalDate dataDeValidade) {
    super(nome, preco, quantidade, dataDeFabricacao);
    this.dataDeValidade = dataDeValidade;
  }

  public boolean isVencido() {
    return LocalDate.now().isAfter(getDataDeValidade());
  }

  public LocalDate getDataDeValidade() {
    return dataDeValidade;
  }

  public void setDataDeValidade(LocalDate dataDeValidade) {
    this.dataDeValidade = dataDeValidade;
  }

  @Override
  public String toString() {
    return super.toString() + " dataDeValidade: " + dataDeValidade;
  }
}
