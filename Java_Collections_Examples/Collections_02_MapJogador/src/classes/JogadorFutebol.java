package classes;

import java.util.Map;
import java.util.TreeMap;

public class JogadorFutebol {
    
  private String nome;
  private int idade;
  private Map<String, Integer> golsPorTime = new TreeMap<>();
  
  public JogadorFutebol(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void adicionarGolsPorTime(String time, int gols) {
    golsPorTime.put(time, gols);
  }

  public void exibirGolsPorTime() {
    System.out.println("\nJogador: " + nome + "\nIdade: " + idade + "\nGols por time: \n");
    for(Map.Entry<String, Integer> entry : golsPorTime.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
  

}
