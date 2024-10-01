import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca pp = new ContaPoupanca();

        // Variaveis
        int opcao;
        String correntista;
        String numero_conta;
        int numero_agencia;

        System.out.println("-----Bem vindo ao aplicativo do Banco Paradise-----");
        do {

            System.out.println("Bem vindo, " + cc.getCorrentista() + "! Selecione uma opção abaixo:");
            System.out.println("1 - Acessar Conta Corrente");
            System.out.println("2 - Acessar poupanca");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    cc.menu();
                    break;
                case 2:
                    pp.menu();
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }

        } while (opcao != 3);

    }
}
