import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        int estoqueAtual, estoqueMax, estoqueMin;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade atual em estoque: ");
        estoqueAtual = scanner.nextInt();

        System.out.print("Quantidade máxima em estoque: ");
        estoqueMax = scanner.nextInt();

        System.out.print("Quantidade mínima em estoque: ");
        estoqueMin = scanner.nextInt();

        // Cálculo da média
        media = (estoqueMax + estoqueMin) / 2.0;

        // Verificação
        if (estoqueAtual >= media) {
            System.out.println("Não efetuar compra");
        }
        else {
            System.out.println("Efetuar compra");
        }

        scanner.close();
    }
}
