import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        String nomeVendedor, mes;
        int carrosVendidos;
        double valorTotalVendas, salario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        nomeVendedor = scanner.nextLine();

        System.out.print("Mês: ");
        mes = scanner.nextLine();

        System.out.print("Número de carros vendidos: ");
        carrosVendidos = scanner.nextInt();

        System.out.print("Valor total das vendas R$: ");
        valorTotalVendas = scanner.nextDouble();

        // Cálculo
        salario = 1500.00 + (carrosVendidos * 350.00) + (valorTotalVendas * 0.00001);

        // Saída
        System.out.printf("\nVendedor: %s%n", nomeVendedor);
        System.out.printf("Mês: %s%n", mes);
        System.out.printf("Carros vendidos: %d%n", carrosVendidos);
        System.out.printf("Valor total vendas: R$ %.2f%n", valorTotalVendas);
        System.out.printf("Salário total: R$ %.2f%n", salario);

        scanner.close();
    }
}