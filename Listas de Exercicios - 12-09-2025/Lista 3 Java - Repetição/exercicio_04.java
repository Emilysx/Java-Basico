import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("Saída: ");

        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i);

            if (i + incremento <= numero) {
                System.out.print(", ");
            }
        }

        scanner.close();

    }
}
