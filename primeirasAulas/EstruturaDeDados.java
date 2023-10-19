package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Dani");
    names.add("Vini");
    names.add("Elias");

    System.out.println(names.get(0));
    System.out.println(names.get(1));
    System.out.println(names.get(2));

    names.forEach(name -> System.out.println("O nome que apareceu foi " + names));

    names.forEach(System.out::println);
  }
}