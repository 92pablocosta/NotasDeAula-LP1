public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void quemSouEu(String nome, int idade, String sexo) {
        System.out.println("Meu nome é " + nome + ", " + idade + "anos de idade.");
    }

    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade;
    }

    // aula 8

    public abstract void quemSouEu();
    public abstract void minhaAtividade();

}
