import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1;
        double nota2;
        double media;

        System.out.println("Digite o nome do aluno: ");
        nome = sc.next();

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno " + nome + " foi de " + media + ".");

        if (media >= 7) {
            System.out.println("O aluno está APROVADO!");
        }else if (media >= 4 && media < 7) {
            System.out.println("O aluno terá que fazer PROVA FINAL.");
        }else {
            System.out.println("O aluno está REPROVADO.");
        }

    }
}
