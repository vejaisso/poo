// Classe filha (subclasse) que herda de Pessoa
public class Aluno extends Pessoa {
    // Atributos específicos da classe Aluno
    private String matricula;
    private String curso;
    private double mediaNotas;
    
    // Construtor
    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf); // Chama o construtor da classe pai
        this.matricula = matricula;
        this.curso = curso;
        this.mediaNotas = 0.0;
    }
    
    // Métodos específicos da classe Aluno
    public void estudar() {
        System.out.println(nome + " está estudando para o curso de " + curso);
    }
    
    public void adicionarNota(double nota) {
        mediaNotas = (mediaNotas + nota) / 2;
        System.out.println("Nova média: " + mediaNotas);
    }
    
    public void mostrarBoletim() {
        System.out.println("=== BOLETIM DO ALUNO ===");
        apresentar(); // Método herdado da classe pai
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Média: " + mediaNotas);
        System.out.println("Situação: " + (mediaNotas >= 6 ? "Aprovado" : "Reprovado"));
        System.out.println("========================");
    }
    
    // Getters e Setters específicos
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double getMediaNotas() {
        return mediaNotas;
    }
}