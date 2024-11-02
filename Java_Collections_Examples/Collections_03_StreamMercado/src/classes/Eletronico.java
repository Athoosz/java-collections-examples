package classes;

import java.time.LocalDate;

public class Eletronico extends Produto {

  private int garantiaMeses;

  public Eletronico(
      String nome, double preco, int quantidade, LocalDate dataDeFabricacao, int garantiaMeses) {
    super(nome, preco, quantidade, dataDeFabricacao);
    this.garantiaMeses = garantiaMeses;
  }

  public int getGarantiaMeses() {
    return garantiaMeses;
  }

  public void setGarantiaMeses(int garantiaMeses) {
    if (garantiaMeses > 0) {
      this.garantiaMeses = garantiaMeses;
    }
  }

  public LocalDate calcularGarantiaEstendida() {
    return getdataDeFabricacao().plusMonths(garantiaMeses);
  }

  @Override
  public String toString() {
    return super.toString() + " garantiaMeses: " + garantiaMeses;
  }
}
