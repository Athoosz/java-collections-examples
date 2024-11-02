package classes;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mercado<T> {
  private Set<T> carrinhoDeCompras;

  public Mercado(boolean useTreeSet) {
    if (useTreeSet) {
      this.carrinhoDeCompras = new TreeSet<>();
    } else {
      this.carrinhoDeCompras = new LinkedHashSet<>();
    }
  }

  public void adicionarProduto(T produto) {
    carrinhoDeCompras.add(produto);
  }

  public void removerProduto(T produto) {
    carrinhoDeCompras.remove(produto);
  }

  public void mostrarCarrinho() {
    for (T produto : carrinhoDeCompras) {
      System.out.println(produto);
    }
  }
}
