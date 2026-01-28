import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        double valorUnitario, valorTotal;
        int quantidade;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: R$ ");
        valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade desejada: ");
        quantidade = scanner.nextInt();

        // Cálculo
        if (quantidade <= 12) {
            valorTotal = valorUnitario * quantidade;
        }
        else {
            double valorComDesconto = valorUnitario * 0.90;
            valorTotal = valorComDesconto * quantidade;
        }

        // Saída
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}