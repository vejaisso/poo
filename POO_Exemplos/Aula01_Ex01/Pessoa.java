// Classe pai (superclasse)
public class Pessoa {
    // Atributos protegidos (acessíveis pelas classes filhas)
    protected String nome;
    protected int idade;
    protected String cpf;
    
    // Construtor
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    // Métodos da classe pai
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf);
    }
    
    public void fazerAniversario() {
        idade++;
        System.out.println(nome + " fez aniversário! Nova idade: " + idade);
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCpf() {
        return cpf;
    }
}