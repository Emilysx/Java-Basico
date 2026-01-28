import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        double valorMercadoria, valorRepresentante, imposto, valorVenda;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua Mercadoria: ");
        valorMercadoria = scanner.nextDouble();

        // Cálculos
        valorRepresentante = valorMercadoria * 0.20;
        imposto = valorMercadoria * 0.30;
        valorVenda = valorMercadoria + valorRepresentante + imposto;

        // Saída
        System.out.printf("Valor do representante (20%%): %.2f%n", valorRepresentante);
        System.out.printf("Valor dos impostos (30%%): %.2f%n", imposto);
        System.out.printf("Valor total de venda: %.2f%n", valorVenda);

        scanner.close();

    }
}
