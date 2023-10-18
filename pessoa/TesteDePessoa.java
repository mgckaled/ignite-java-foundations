package pessoa;

public class TesteDePessoa {

  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.setCpf("3333322211");
    professor.setNome("Marcel");
    professor.setIdade(35);
    professor.setSalario(50000);


    System.out.println(professor.imprimirDadosDaPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("0909090909");
    aluno.setNome("Lucas");
    aluno.setIdade(34);
    aluno.setMatricula("432567");

    System.out.println(aluno.imprimirDadosDaPessoa());
  }

}
