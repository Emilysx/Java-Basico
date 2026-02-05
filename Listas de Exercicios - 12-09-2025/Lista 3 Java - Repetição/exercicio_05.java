import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int total = 0;
        String continuar;

        do {
            System.out.print("Digite o saldo: ");
            double saldo = scanner.nextDouble();

            if (saldo >= 0) {
                positivos++;
            } else {
                negativos++;
            }

            total++;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S"));

        // Resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Saldos positivos: " + positivos);
        System.out.println("Saldos negativos: " + negativos);
        System.out.println("Total de pessoas: " + total);

        // Verificar risco
        if (total > 0) {
            double percentualPositivos = (double) positivos / total * 100;

            if (percentualPositivos >= 50) {
                System.out.println("Nenhum risco!");
            } else {
                System.out.println("Risco ao banco!");
            }
        }

        scanner.close();

    }
}
