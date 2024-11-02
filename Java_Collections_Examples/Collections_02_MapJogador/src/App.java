import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        JogadorFutebol jogador = new JogadorFutebol("Deyverson", 33);
        jogador.adicionarGolsPorTime("Cuiaba", 10);
        jogador.adicionarGolsPorTime("Palmeiras", 20);
        jogador.adicionarGolsPorTime("Atletico MG", 20);

        jogador.exibirGolsPorTime();
    }
}
