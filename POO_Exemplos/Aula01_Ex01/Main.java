// Classe principal com método main
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA ESCOLAR ===\n");
        
        // Criando um objeto da classe pai (Pessoa)
        Pessoa pessoa = new Pessoa("Maria Silva", 35, "123.456.789-00");
        System.out.println("Pessoa criada:");
        pessoa.apresentar();
        pessoa.fazerAniversario();
        System.out.println();
        
        // Criando um objeto da classe filha (Aluno)
        Aluno aluno = new Aluno("João Santos", 18, "987.654.321-00", 
                               "2023001", "Engenharia de Software");
        
        System.out.println("Aluno criado:");
        aluno.apresentar(); // Método herdado da classe pai
        aluno.estudar(); // Método específico da classe Aluno
        
        // Adicionando notas e mostrando boletim
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.0);
        aluno.adicionarNota(9.2);
        
        System.out.println();
        aluno.mostrarBoletim();
        
        // Demonstrando polimorfismo
        System.out.println("=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        Pessoa pessoaComoAluno = new Aluno("Ana Costa", 19, "111.222.333-44", "2023002", "Medicina");
        
        // pessoaComoAluno pode acessar métodos da classe Pessoa
        pessoaComoAluno.apresentar();
        pessoaComoAluno.fazerAniversario();
        
        // Para acessar métodos específicos de Aluno, precisa de casting
        if (pessoaComoAluno instanceof Aluno) {
            Aluno alunoCast = (Aluno) pessoaComoAluno;
            alunoCast.estudar();
        }
    }
}