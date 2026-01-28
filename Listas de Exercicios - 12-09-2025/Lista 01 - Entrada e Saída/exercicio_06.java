import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        // Cálculos
        media = (nota1 * 0.4) + (nota2 * 0.6);

        // Saída
        System.out.printf("A média ponderada é: %.2f%n", media);

        scanner.close();
    }
}
