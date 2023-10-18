package conta;

public class TesteContaBancaria {

  public static void main(String[] args) {

    ContaBancaria contaBancaria1 = new ContaBancaria();
    contaBancaria1.setNumero("1234");
    contaBancaria1.setTitular("Marcel");

    contaBancaria1.depositar(150.0);
    contaBancaria1.sacar(50.0);
  }
}
