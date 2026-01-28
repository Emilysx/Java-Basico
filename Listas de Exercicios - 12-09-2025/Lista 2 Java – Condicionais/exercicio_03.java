import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        int timeA, timeB;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gols do Time A: ");
        timeA = scanner.nextInt();

        System.out.print("Gols do Time B: ");
        timeB = scanner.nextInt();

        // Verificação do resultado
        if (timeA > timeB) {
            System.out.println("Time A venceu!");
        }
        else if (timeB > timeA) {
            System.out.println("Time B venceu!");
        }
        else {
            System.out.println("Empate!");
        }

        scanner.close();
    }
}