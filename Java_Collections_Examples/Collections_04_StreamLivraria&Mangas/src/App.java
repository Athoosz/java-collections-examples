import classes.*;

public class App {
  public static void main(String[] args) throws Exception {

    Livraria mangas = new Livraria();

    mangas.adicionarManga(new Manga("Naruto", 15.0));
    mangas.adicionarManga(new Manga("One Piece", 10.0));
    mangas.adicionarManga(new Manga("Bleach", 5.0));
    mangas.adicionarManga(new Manga("Dragon Ball", 20.0));
    mangas.adicionarManga(new Manga("Death Note", 7.0));
    mangas.adicionarManga(new Manga("Shingeki no Kyojin", 12.0));
    mangas.adicionarManga(new Manga("Tokyo Ghoul", 8.0));
    mangas.adicionarManga(new Manga("Boku no Hero", 9.0));

    System.out.println("Mangas baratos: ");
    System.out.println(mangas.exibirmarMangasBaratos());

    System.out.println("Mangas por preço: ");
    System.out.println(mangas.exibirMangasPorPreco());
  }
}
