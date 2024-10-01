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

        System.out.println("Insira o nome do titular da conta: ");
        correntista = sc.nextLine();

        System.out.println("Insira o numero da sua conta: ");
        numero_conta = sc.nextLine();

        System.out.println("Insira o numero de agencia: ");
        numero_agencia = sc.nextInt();



        do {
            System.out.println("Bem vindo, " + correntista + "! Selecione uma opção abaixo:");
            System.out.println("1 - Acessar conta corrente");
            System.out.println("2 - Acessar poupanca");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    int op;
                    do {
                    System.out.println("Você está no menu da sua Conta Corrente");
                    System.out.println("Escolha uma opção para começarmos:");
                    System.out.println("1 - Saldo");
                    System.out.println("2 - Deposito");
                    System.out.println("3 - Saque");
                    System.out.println("4 - Dados da conta");
                    System.out.println("0 - Sair");
                    op = sc.nextInt();


                        switch (op) {
                            case 1:
                                System.out.println("O saldo atual é de R$" + cc.getValor_em_conta());
                                break;
                            case 2:
                                cc.deposito();
                                break;
                            case 3:
                                cc.saque();
                                break;
                            case 4:
                                cc.dados_conta(correntista, numero_conta, numero_agencia);
                        }
                    } while (op != 0);
                    break;

                case 2:
                    System.out.println("Você está no menu da sua Conta Poupança!");
                    System.out.println("Escolha uma opção para começarmos:");
                    System.out.println("1 - Saldo");
                    System.out.println("2 - Deposito");
                    System.out.println("3 - Saque");
                    System.out.println("4 - Dados da conta");
                    System.out.println("0 - Sair");
                    break;

                case 3:
                    break;
            }

        } while (opcao != 3);

    }
}
