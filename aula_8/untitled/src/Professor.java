public final class Professor extends Pessoa implements Remuneravel {
    String disciplina_ministrada;

    public Professor(String nome, int idade, String sexo, String disciplina_ministrada) {
        super(nome, idade, sexo);
        this.disciplina_ministrada = disciplina_ministrada;
    }

    //toString

    @Override
    public void quemSouEu() {
        System.out.println("Sou o professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Salario do professor");
    }

    @Override
    public void calcularBonus() {
        System.out.println("Bonus do professor");
    }

}
