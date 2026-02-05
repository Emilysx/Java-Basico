import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisPesada = "";
        double pesoMaisPesada = 0;

        String nomeMaisAlta = "";
        double alturaMaisAlta = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nPessoa " + i + ":");

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            // Verificar a mais pesada
            if (peso > pesoMaisPesada) {
                pesoMaisPesada = peso;
                nomeMaisPesada = nome;
            }

            // Verificar a mais alta
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlta = nome;
            }
        }

        // Resultados
        System.out.println("\nRESULTADOS");
        System.out.println("Mais pesada: " + nomeMaisPesada + " com " + pesoMaisPesada + "kg");
        System.out.println("Mais alta: " + nomeMaisAlta + " com " + alturaMaisAlta + "m");

        scanner.close();
    }
}
