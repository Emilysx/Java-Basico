import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int opcao;

        Scanner scanner = new Scanner(System.in);

        // Pegar os 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Menu
        System.out.println("\nO que você quer saber?");
        System.out.println("1 - Quantos números pares?");
        System.out.println("2 - Quantos números ímpares?");
        System.out.println("3 - Quantos negativos?");
        System.out.println("4 - Quantos positivos?");
        System.out.println("5 - Sair");
        System.out.print("Escolha: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1: // Pares
                int pares = 0;
                for (int i = 0; i < 10; i++) {
                    if (numeros[i] % 2 == 0) {
                        pares++;
                    }
                }
                System.out.println("Números pares: " + pares);
                break;

            case 2: // Ímpares
                int impares = 0;
                for (int i = 0; i < 10; i++) {
                    if (numeros[i] % 2 != 0) {
                        impares++;
                    }
                }
                System.out.println("Números ímpares: " + impares);
                break;

            case 3: // Negativos
                int negativos = 0;
                for (int i = 0; i < 10; i++) {
                    if (numeros[i] < 0) {
                        negativos++;
                    }
                }
                System.out.println("Números negativos: " + negativos);
                break;

            case 4: // Positivos
                int positivos = 0;
                for (int i = 0; i < 10; i++) {
                    if (numeros[i] > 0) {
                        positivos++;
                    }
                }
                System.out.println("Números positivos: " + positivos);
                break;

            case 5: // Sair
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();

    }
}
