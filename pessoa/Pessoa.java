package pessoa;

public class Pessoa {

  String nome;
  int idade;
  String cpf;

  String imprimirDadosDaPessoa() {
    return "O nome da é pessoa é " + nome + ", a idade é " + idade + ", com CPF n° " + cpf;
  }

}
