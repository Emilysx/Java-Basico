import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        int num1, antecessor, sucessor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        num1 = scanner.nextInt();

        // Cálculo
        antecessor = num1 - 1;
        sucessor = num1 + 1;

        // Saída
        System.out.printf("O número informado foi %d \nAntecessor: %d\nSucessor: %d",num1, antecessor, sucessor);

        scanner.close();
    }
}
