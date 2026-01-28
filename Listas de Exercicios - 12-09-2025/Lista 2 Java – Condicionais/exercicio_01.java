import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        idade = scanner.nextInt();

        if (idade <= 14) {
            System.out.println("Criança");
        }
        else if (idade <= 17) {
            System.out.println("Adolescente");
        }
        else if (idade <= 30) {
            System.out.println("Adulto jovem");
        }
        else {
            System.out.println("Adulto");
        }

        scanner.close();
    }
}