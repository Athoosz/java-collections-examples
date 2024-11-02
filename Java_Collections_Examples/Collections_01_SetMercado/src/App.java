import classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Carrinho de compras com LinkedHashSet (Ordena por ordem de inserção)
        Mercado<Object> carrinhoDeCompras = new Mercado<>(false);
        carrinhoDeCompras.adicionarProduto(new Fruta("Maça", 3.0));
        carrinhoDeCompras.adicionarProduto(new Fruta("Banana", 5.0));
        carrinhoDeCompras.adicionarProduto(new Fruta("Morango", 10.0));

        // Carrinho de compras com TreeSet (Ordena em ordem alfabética)
        Mercado<Object> carrinhoDeCompras2 = new Mercado<>(true);
        carrinhoDeCompras2.adicionarProduto(new Carne("Linguiça", 22.0));
        carrinhoDeCompras2.adicionarProduto(new Carne("Picanha", 25.0));
        carrinhoDeCompras2.adicionarProduto(new Carne("Filé", 25.0));

        System.out.println("\nCarrinho de compras n° 1 : ");
        carrinhoDeCompras.mostrarCarrinho();

        System.out.println("\nCarrinho de compras n° 2 : ");
        carrinhoDeCompras2.mostrarCarrinho();

    }
}
