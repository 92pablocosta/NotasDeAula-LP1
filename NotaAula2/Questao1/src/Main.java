import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Variaveis
        int opcao;
        double conta_corrente;
        double poupanca;
        String correntista;
        String numero_conta;
        int numero_agencia;

        System.out.println("-----Bem vindo ao aplicativo do Banco Paradise-----");

        System.out.println("Insira o nome do titular da conta: ");
        correntista = sc.nextLine();

        System.out.println("Insira o numero da sua conta: ");
        numero_conta = sc.nextLine();

        System.out.println("Insira o numero de agencia: ");
        numero_agencia = sc.nextInt();

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca pp = new ContaPoupanca();

        do {
            System.out.println("Bem vindo, " + correntista + "! Selecione uma opção abaixo:");
            System.out.println("1 - Acessar conta corrente");
            System.out.println("2 - Acessar poupanca");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:


            }

        } while (opcao != 3);

    }
}
