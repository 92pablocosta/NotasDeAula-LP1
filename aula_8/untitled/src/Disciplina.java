public class Disciplina {

    private String nome;
    private double carga_horaria;
    private Aluno aluno;
    private Professor professor;

    public Disciplina(String nome, double carga_horaria, Aluno aluno, Professor professor) {
        this.nome = nome;
        this.aluno = aluno;
        this.carga_horaria = carga_horaria;
        this.professor = professor;
    }

}