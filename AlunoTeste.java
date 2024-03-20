public class AlunoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Gabriel", 7, "130616");

        System.out.println("Antes da alteração:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());

        aluno1.setNome("Marya");
        aluno1.setIdade(24);

        System.out.println("\nDepois da alteração:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
    }
}
