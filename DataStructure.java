import java.util.ArrayList;
import java.util.List;

public class DataStructure {
  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();
    nomes.add("Matheus Fonteles");
    nomes.add("Jaderson Cavalcante");
    nomes.add("Marcelo Amorim");

    // for (String nome : nomes) {
    // System.out.println(" o nome é " + nome);
    // } Método Antigo

    nomes.forEach(nome -> System.out.println(nome));
  }
}
