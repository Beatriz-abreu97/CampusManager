class PessoaTeste extends Pessoa {

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste q. 1 e 2(classe pessoa)");

        PessoaTeste beatriz = new PessoaTeste();
        beatriz.setNome("Beatriz Abreu");
        beatriz.setIdade(28);

        System.out.println("Nome: " + beatriz.getNome());
        System.out.println("Idade inicial: " + beatriz.getIdade());
    
        beatriz.fazerAniversario();

        System.out.println("Nova idade:" + beatriz.getIdade());

        System.out.println("---------------");

        Disciplina poo = new Disciplina();
        poo.setNomeDisciplina("Programação Orientada a Objetos");
        poo.setCodigo(685);

        System.out.println("Disciplina: " + poo.getNomeDisciplina());
        System.out.println("Código: " + poo.getCodigo());

        Aluno novoAluno = new Aluno();
        novoAluno.setNome("Beatriz");
        novoAluno.pagarMensalidade();      
        
        AlunoRegular novoAlunoRegular = new AlunoRegular();
        novoAlunoRegular.setNome("Paula");
        novoAlunoRegular.pagarMensalidade();

        AlunoBolsista novoBolsista = new AlunoBolsista();
        novoBolsista.setNome("Pedro");
        novoBolsista.pagarMensalidade();

        Professor novoProfessor = new Professor ();
        novoProfessor.setNome("Matheus");
        novoProfessor.setCentro("Matemática");
        novoProfessor.darAula();

    }
    
}
