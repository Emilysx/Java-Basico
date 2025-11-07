//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Circulo circuloVermelho = new Circulo("Vermelho", 2);
//        System.out.printf("A área do circulo %s é de: %.2f\n", circuloVermelho.cor,circuloVermelho.calcularArea());
//
//        Circulo circuloAzul = new Circulo("Azul", 3);
//        System.out.printf("A área do circulo %s é de: %.2f\n", circuloAzul.cor, circuloAzul.calcularArea());

//        Investimento investimentoDeMarcelo = new Investimento("Marcelo", 1000);
//        Investimento investimentoDeNick = new Investimento("Nick", 1000);
//
//        Investimento.taxaDeRentabilidade = 0.03;
//
//        System.out.printf("O investimento de %s está com o saldo de: R$%.2f\n", investimentoDeMarcelo.nomeDoInvestidor, investimentoDeMarcelo.sladoAtual);
//        System.out.printf("O investimento de %s está com o saldo de: R$%.2f\n", investimentoDeNick.nomeDoInvestidor, investimentoDeNick.sladoAtual);
//
//        investimentoDeMarcelo.rentabilizar();
//        investimentoDeNick.rentabilizar();
//
//        System.out.printf("O investimento de %s está com o saldo de: R$%.2f\n", investimentoDeMarcelo.nomeDoInvestidor, investimentoDeMarcelo.sladoAtual);
//        System.out.printf("O investimento de %s está com o saldo de: R$%.2f\n", investimentoDeNick.nomeDoInvestidor, investimentoDeNick.sladoAtual);

        System.out.println("Contagem de licenças atual: "+ Lincenca.retornaLincencasAtribuidas());
        Lincenca windows = new Lincenca("Windows", "Escola de Aprendizagem");
        System.out.println("Contagem de lincenças após compra de windows: " + Lincenca.retornaLincencasAtribuidas());

        Lincenca docker = new Lincenca("Docker", "Tecnologia");
        System.out.println("Contagem de lincenças após a compra o docker: " + Lincenca.retornaLincencasAtribuidas());




    }
}