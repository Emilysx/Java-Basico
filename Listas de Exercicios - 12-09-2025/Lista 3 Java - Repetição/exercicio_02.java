import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double altura, peso;
        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nPessoa " + i);

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            System.out.print("Peso: ");
            peso = scanner.nextDouble();

            // Contar
            if (idade > 50) c1++;
            if (altura > 1.60) c2++;
            if (peso < 80) c3++;
        }

        System.out.println("\nResultados:");
        System.out.println("Acima de 50 anos: " + c1);
        System.out.println("Acima de 1.60m: " + c2);
        System.out.println("Abaixo de 80kg: " + c3);

        scanner.close();

    }
}
