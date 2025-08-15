import java.util.Scanner;

public class exemplo_while2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 0, acumulador = 0;

        while (contador < 5) {
            System.out.println(contador);
            contador++;
            System.out.print("Insira um número: ");
            acumulador += scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Contador está em %d e " +
                    "o acumulador está em %d\n", contador, acumulador);

        }
    }
}
