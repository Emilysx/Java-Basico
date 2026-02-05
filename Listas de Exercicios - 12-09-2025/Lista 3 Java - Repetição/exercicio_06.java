import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
