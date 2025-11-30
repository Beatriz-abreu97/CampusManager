public class Visitante extends Pessoa {
    public Visitante(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }
    public void visitar() {
            System.out.println("O(A) " + this.getNome() + " visitou a turma.");
        }
}
