package pessoa;

public class TesteDePessoa {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.cpf = "3333322211";
    pessoa1.nome = "Marcel";
    pessoa1.idade = 35;
    
    System.out.println(pessoa1.imprimirDadosDaPessoa());

    Pessoa pessoa2 = new Pessoa();
    pessoa2.cpf = "09090909090";
    pessoa2.nome = "Lucas";
    pessoa2.idade = 34;

    System.out.println(pessoa2.imprimirDadosDaPessoa());
  }

}
