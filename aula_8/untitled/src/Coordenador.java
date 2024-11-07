public class Coordenador extends Pessoa {

    private String curso;

    public Coordenador(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);
        this.curso = curso;
    }

    public String setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }


}
