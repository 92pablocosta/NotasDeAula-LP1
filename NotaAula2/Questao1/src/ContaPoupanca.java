import java.util.Scanner;

public class ContaPoupanca {

    public double valor_em_conta;
    public double valor_deposito;
    public double valor_saque;

    public ContaPoupanca() {

        this.valor_em_conta = 0;
        this.valor_deposito = 0;
        this.valor_saque = 0;

    }

    public void menu() {

        System.out.println("Você está no menu da sua Conta Poupança!");
        System.out.println("Escolha uma opção para começarmos:");
        System.out.println("1 - Saldo");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saque");
        System.out.println("4 - Dados da conta");
        System.out.println("0 - Sair");

    }

}
