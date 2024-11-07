public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }


    // metodos


}
