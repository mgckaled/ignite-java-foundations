package veiculo;

public class TestDeVeiculo {

  public static void main(String[] args) {

    Veiculo carro = new Carro();
    Veiculo moto = new Moto();

    carro.acelerar();
    carro.frear();

    moto.acelerar();
    moto.frear();
  }
}
