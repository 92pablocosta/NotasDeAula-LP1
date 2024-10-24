public class Aluno {

    private String nome_completo;
    private String nome_preferido;
    private int idade;
    private String sexo;

    public Aluno(String nome_completo, String nome_preferido, int idade, String sexo) {
        this.nome_completo = nome_completo;
        this.nome_preferido = nome_preferido;
        this.idade = idade;
        this.sexo = sexo;
    }

    // get e set

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_preferido(String nome_preferido) {
        this.nome_preferido = nome_preferido;
    }

    public String getNome_preferido() {
        return nome_preferido;
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


    // metodos


}
