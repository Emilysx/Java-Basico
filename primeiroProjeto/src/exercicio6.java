import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        double a, b, c, delta;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor para A: ");
        a = scanner.nextDouble();

        System.out.print("Informe um valor para B: ");
        b = scanner.nextDouble();

        System.out.print("Informe um valor para C: ");
        c = scanner.nextDouble();

        delta = (b * b) - (4 * a * c);

        System.out.printf("O Delta é de: %.2f", delta);
        scanner.close();
    }
}
