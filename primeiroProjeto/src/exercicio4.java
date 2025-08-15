import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        double valor, quadrado, cubo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o um número: ");
        valor = scanner.nextDouble();

        quadrado = Math.pow(valor, 2);
        cubo = Math.pow(valor, 3);

        System.out.printf("O valor ao quadrado: %.2f \n", quadrado);
        System.out.printf("O valor ao cubo: %.2f", cubo);
    }
}
