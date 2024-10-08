import java.util.Scanner;

public class ContaPoupanca {

    Scanner sc = new Scanner(System.in);

    public String correntista = "Fernanda";
    public String conta = "1122-0";
    public int agencia = 22_004;

    public double valor_em_conta;
    public double valor_deposito;
    public double valor_saque;

    public double rendimento;
    private int opcao;

    public ContaPoupanca() {

        this.valor_em_conta = 0;
        this.valor_deposito = 0;
        this.valor_saque = 0;
        this.rendimento = 0;
        this.opcao = 0;

    }

    public void menu() {

        System.out.println("Você está no menu da sua Conta Poupança!");
        System.out.println("Escolha uma opção para começarmos:");
        System.out.println("1 - Saldo");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saque");
        System.out.println("4 - Dados da conta");
        System.out.println("5 - Calcular rendimento");
        System.out.println("0 - Sair");

        opcao = sc.nextInt();

        switch (opcao) {
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
            case 5:
                calcularRendimento();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }

    public void saldo() {
        System.out.println("Saldo disponível: R$" + valor_em_conta);
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
        } else {
            valor_em_conta -= valor_saque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo Saldo (CP): R$ " + valor_em_conta);
        }
    }

    public void dados_conta() {

        System.out.println("Correntista: " + correntista);
        System.out.println("Número da conta: " + conta);
        System.out.println("Agencia: " + agencia);

    }

    public void calcularRendimento() {


        System.out.println("Digite a quantidade de meses para saber o rendimento final:");
        int quantidade_meses = sc.nextInt();

        for (int i = 0; i < quantidade_meses; i++) {

            rendimento = (valor_em_conta + rendimento) * 0.05;

        }
        System.out.println("Rendimento: " + rendimento);
    }


}
