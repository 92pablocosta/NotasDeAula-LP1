import java.util.Scanner;

public class Corrida {

    double distancia;
    int tempoEspera;
    double tarifaBase;
    double fatorDemanda;
    double valorFinal;

    public Corrida() {

        this.distancia = 0;
        this.tempoEspera = 0;
        this.tarifaBase = 0;
        this.fatorDemanda = 0;
        this.valorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;

    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public double getValorFinal() {
        return valorFinal;
    }


    public double calcularValorCorrida() {

        this.valorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
        return valorFinal;

    }

    public void exibirDetalhesCorrida() {

        System.out.println("Distancia: " + distancia);
        System.out.println("Tempo Espera: " + tempoEspera);
        System.out.println("TarifaBase: " + tarifaBase);
        System.out.println("Fator Demanda: " + fatorDemanda);

    }
}
