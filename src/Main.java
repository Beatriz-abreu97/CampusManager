public class Main {
  public static void main(String[] args) {
    System.out.println("Teste q. 1 e 2(classe pessoa)");
    Aluno aluno1 = new Aluno("Beatriz Abreu", "000.000.000-00", 28, "112-3");


    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Idade inicial: " + aluno1.getIdade());

    aluno1.fazerAniversario();

    System.out.println("Nova idade:" + aluno1.getIdade());

    System.out.println("---------------");

    Disciplina poo = new Disciplina("Matemática", "685", "2025.2");

    System.out.println("Disciplina: " + poo.getNome());
    System.out.println("Código: " + poo.getCodigo());
    System.out.println("Semestre: " + poo.getSemestre());

    System.out.println("---------------");

    Aluno novoAluno = new Aluno("Paula", "111.111.111-11", 30, "xxxx-x");
    novoAluno.pagarMensalidade();

    System.out.println("---------------");

    AlunoRegular novoAlunoRegular = new AlunoRegular("Maria", "222.222.222-22", 25, "000000-0");
    novoAlunoRegular.pagarMensalidade();

    System.out.println("---------------");

    AlunoBolsista novoBolsista = new AlunoBolsista("João", "333.333.333-33", 22, "zzzz-z");
    novoBolsista.pagarMensalidade();

    System.out.println("---------------");

    Professor novoProfessor = new Professor("Matheus", "555.555.555-55", 35, "Matemática");
    novoProfessor.darAula();

    System.out.println("---------------");

  }

}
