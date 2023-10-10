import java.util.HashMap;
import java.util.Map;

public class Collections {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Matheus", 10);
    notas.put("Amanda", 10);
    notas.put("Jaderson", 8);

    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é: " + key + "O value é : " + value);
    }
  }
}
