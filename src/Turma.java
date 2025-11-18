import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina Disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    Turma(String codigo, Disciplina Disciplina, Professor professor, Aluno alunos) {

        this.codigo = codigo;
        this.Disciplina = Disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
        System.out.println("Aluno(a) " + aluno.getNome() + " Adicionado.");
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
        }
        System.out.println("Aluno(a) " + aluno.getNome() + " Removido.");
    }

    public void listarAluno(Aluno aluno) {
    }

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
