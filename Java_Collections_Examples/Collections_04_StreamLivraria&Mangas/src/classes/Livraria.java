package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Livraria {

  private List<Manga> mangas = new ArrayList<>();

  public Livraria() {
    this.mangas = new ArrayList<>();
  }

  public List<Manga> getMangas() {
    return mangas;
  }

  public void adicionarManga(Manga manga) {
    mangas.add(manga);
  }

  public void removerManga(Manga manga) {
    mangas.remove(manga);
  }

  public List<Manga> exibirmarMangasBaratos() {
    return mangas.stream()
        .sorted((m1, m2) -> m1.getNome().compareTo(m2.getNome()))
        .filter(m -> m.getPreco() <= 10)
        .collect(Collectors.toList());
  }

  public List<Manga> exibirMangasPorPreco() {
    return mangas.stream()
        .sorted((m1, m2) -> Double.compare(m1.getPreco(), m2.getPreco()))
        .collect(Collectors.toList());
  }

  @Override
  public String toString() {
    return "Livraria mangas: " + mangas + "\n";
  }
}
