//    Produto p = new Produto("Geladeira", "001", 150.5, "Branca", 3249.90, 5);
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int op;

    System.out.println("--Cadastrando um produto--");

    System.out.println("Digite o nome do produto: ");
    String nome = sc.nextLine();

    System.out.println("Digite o código do produto: ");
    String codigo = sc.nextLine();

    System.out.println("Digite o peso: ");
    double peso = sc.nextDouble();

    System.out.println("Digite a cor: ");
    String cor = sc.next();

    System.out.println("Digite o preço: R$");
    double valor = sc.nextDouble();

    System.out.println("Quantos desse item tem em estoque? :");
    int estoque = sc.nextInt();

    Produto p = new Produto(nome, codigo, peso, cor, valor, estoque);

    do {
        System.out.println("Selecione uma das opções abaixo: ");
        System.out.println("1 - Realizar venda");
        System.out.println("2 - Detalhes do produto");
        System.out.println("0 - Sair");
        op = sc.nextInt();

        switch (op) {

            case 1:
                System.out.println("Quantos do produto " + p.getNome() + " gostaria de vender?");
                int quantidade = sc.nextInt();
                p.venda(quantidade);
                System.out.println("Quantidade em estoque após venda: " + p.getEstoque());
                break;

            case 2:
                System.out.println("Detalhes do produto");
                System.out.println("Nome do produto: " + p.getNome());
                System.out.println("Peso: " + p.getPeso());
                System.out.println("Cor: " + p.getCor());
                System.out.println("Valor: " + p.getValor());
                System.out.println("Estoque: " + p.getEstoque());
                break;

            case 3:
                break;
        }


    } while (op != 0);

    }
}
