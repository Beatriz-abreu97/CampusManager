public class Turma extends Pessoa {
  private String codigo;
  private Disciplina Disciplina;
  private Professor professor;

  Turma(String nome, String cpf, int idade, String codigo, Disciplina Disciplina,
      Professor professor) {
    super(nome, cpf, idade);
    this.codigo = codigo;
    this.Disciplina = Disciplina;
    this.professor = professor;
  }

  public void adicionarAluno() {}

  public void removerAluno() {}

  public void listarAluno() {}

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Disciplina getDisciplina() {
    return Disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
    Disciplina = disciplina;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

}
