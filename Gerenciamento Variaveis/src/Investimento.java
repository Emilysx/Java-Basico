public class Investimento {
    String nomeDoInvestidor;
    double sladoAtual;
    static double taxaDeRentabilidade = 0.02;

    public Investimento(String nomeDoInvestidor, double sladoAtual) {
        this.nomeDoInvestidor = nomeDoInvestidor;
        this.sladoAtual = sladoAtual;
    }

    void rentabilizar(){
        this.sladoAtual = this.sladoAtual * (1 + taxaDeRentabilidade);
    }
}
