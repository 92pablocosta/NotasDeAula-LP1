import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        Scanner sc = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Digite a distância da corrida (Km): ");
        c.setDistancia(sc.nextDouble());

        System.out.println("Qual o tempo de espera (em Minutos)?: ");
        c.setTempoEspera(sc.nextInt());

        System.out.println("Valor da corrida: R$" + c.calcularValorCorrida());

        System.out.println("Todos os detalhes:");
        c.exibirDetalhesCorrida();

    }
}
