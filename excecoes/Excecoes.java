package excecoes;

public class Excecoes {

  // Checked exceptions

  // Unchecked exceptions

  public static void main(String[] args) throws Exception {
    try {
      validarNumero();
    } catch (Exception e) {
      e.printStackTrace();
    }

    // Pessoa p = null;
    // p.getCpf();
  }

  public static void validarNumero() throws Exception {
    int numero = 10;

    if (numero < 100) {
      throw new Exception("O número é menor que 100");
    }

  }
}
