import java.util.Scanner;

public class ContaCorrente {

    Scanner sc = new Scanner(System.in);

    public String correntista = "Fernanda";
    public String conta = "1122-0";
    public int agencia = 22_004;

    private double valor_em_conta;
    private double valor_deposito;
    private double valor_saque;

    public ContaCorrente() {

        this.valor_em_conta = 0;
        this.valor_deposito = 0;
        this.valor_saque = 0;

    }

    public String getCorrentista() {
        return correntista;
    }

    public String getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }


    public void menu() {

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
                    saldo();
                    break;
                case 2:
                    deposito();
                    break;
                case 3:
                    saque();
                    break;
                case 4:
                    dados_conta();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);


    }

    public void saldo() {
        System.out.println("Saldo disponível: R$" + valor_em_conta);
    }

    public void dados_conta() {

        System.out.println("Correntista: " + correntista);
        System.out.println("Número da conta: " + conta);
        System.out.println("Agencia: " + agencia);

    }

    public void deposito() {

        System.out.print("Quanto gostaria de depositar? R$");
        valor_deposito = sc.nextDouble();
        valor_em_conta += valor_deposito;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Novo Saldo (CC): R$ " + valor_em_conta);

    }

    public void saque() {

        System.out.print("Quanto gostaria de sacar? R$");
        valor_saque = sc.nextDouble();
        if (valor_saque > valor_em_conta) {
            System.out.println("Saldo insuficiente para saque.");
            System.out.println("Saldo disponível: R$" + valor_em_conta);

            System.out.println("Gostaria de usar o Cheque Especial? [1] - Sim / [2] - Não");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cheque_especial();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } else {
            valor_em_conta -= valor_saque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo Saldo (CC): R$ " + valor_em_conta);
        }

    }

    private void cheque_especial() {
        System.out.println("ATENÇÃO! Ao utilizar essa opção sua conta ficará no negativo. ");
        System.out.println("Limite disponível no Cheque Especial de R$ 1.000,00");
        System.out.println("Gostaria de continuar? [1] - Sim / [2] - Não");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Quanto gostaria de sacar? R$");
                valor_saque = sc.nextDouble();


                if ((valor_em_conta - valor_saque) < -1000) {

                    System.out.println("Valor solicitado excede o limite do Cheque. Tente novamente.");
                    break;

                } else {

                    valor_em_conta -= valor_saque;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Novo Saldo (CC): R$ " + valor_em_conta);
                    break;

                }

            case 2:
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }



    }
}
