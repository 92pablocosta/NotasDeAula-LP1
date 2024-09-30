import java.util.Scanner;
public class Produto {

    Scanner sc = new Scanner(System.in);
    private String nome;
    private String codigo;
    private double peso;
    private String cor;
    private double valor;
    private int estoque;

    public Produto(String nome, String codigo, double peso, String cor, double valor, int estoque) {

        this.nome = nome;
        this.codigo = codigo;
        this.peso = peso;
        this.cor = cor;
        this.valor = valor;
        this.estoque = estoque;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getEstoque() {
        return estoque;
    }

    public void venda(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente.");
        } else {
            double total_venda = quantidade * valor;
            System.out.println("\u001B[34m" + "Valor total da venda: R$" + total_venda);
            System.out.println("Como gostaria de fazer o pagamento?");
            System.out.println("1 - Pix, Transferência ou Débito ");
            System.out.println("2 - Espécie");
            System.out.println("3 - Crédito (até 3x sem juros)" + "\u001B[0m");
            int opcao = sc.nextInt();

            switch (opcao) {


                case 1:
                    double valor_com_desconto = total_venda * 0.95;

                    System.out.println("Você ganhou um desconto de 5% na sua compra!");
                    System.out.println("Valor do desconto: R$" + (total_venda - valor_com_desconto));
                    System.out.println("\u001B[32m" + "Valor final:  R$" + valor_com_desconto + "\u001B[0m");
                    System.out.println("Obrigado por escolher a nossa loja, volte sempre!");
                    break;

                case 2:
                    double valor_pago;
                    double troco;

                    System.out.println("Valor total da compra: R$" + total_venda);

                    System.out.println("Valor pago pelo cliente: ");
                    valor_pago = sc.nextDouble();

                    if (valor_pago > total_venda) {
                        troco = valor_pago - total_venda;
                        System.out.println("Valor pago: R$ " + valor_pago);
                        System.out.println("Valor da compra: R$" + total_venda);
                        System.out.println("Troco: R$" + troco);
                        System.out.println("Venda realizada com sucesso! Obrigado por escolher a nossa loja!");

                    } else if (valor_pago < total_venda) {
                        System.out.println("Valor pago: R$" + valor_pago);
                        System.out.println("Valor pendente: R$" + (total_venda - valor_pago));
                    } else {
                        System.out.println("Pagamento realizado com sucesso!");
                    }
                    break;

                case 3:
                    int parcelas;
                    double valor_parcelas;

                    System.out.println("Em quantas parcelas gostaria de pagar?");
                    parcelas = sc.nextInt();

                    if (parcelas <= 3) {
                        System.out.println("Pagamento sem juros!");
                        System.out.println("Pagamento realizado: " + parcelas + " parcelas de R$" + (total_venda / parcelas));
                    } else {
                        System.out.println("Parcelamento com 10% de juros.");
                        System.out.println("Total a ser pacelado: R$" + total_venda + " + R$" + (total_venda * 0.1) + "(juros) = R$" + (total_venda * 1.1) );
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;


            }
            estoque -= quantidade;
        }


    }
}
