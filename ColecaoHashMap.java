import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {

  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Dani", 10);
    notas.put("Vini", 9);
    notas.put("Elias", 8);

    var nota = notas.get("Vini");
    System.out.println(nota);

    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é " + key + " e o seu valor correspondente é " + value);
    }
  }
}
