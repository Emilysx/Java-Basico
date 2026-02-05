import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int otimo = 0;
        int bom = 0;
        int ruim = 0;
        int total = 0;
        int somaNotas = 0;
        String continuar;

        do {
            System.out.print("\nQual sua opinião sobre o filme? \n");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Escolha (1, 2 ou 3): ");

            int opcao = scanner.nextInt();

            // Contar as opções
            if (opcao == 1) {
                otimo++;
            } else if (opcao == 2) {
                bom++;
            } else if (opcao == 3) {
                ruim++;
            }

            total++;
            somaNotas += opcao;

            // Perguntar se quer continuar
            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S"));

        // Calcular porcentagens
        double percOtimo = (double) otimo / total * 100;
        double percBom = (double) bom / total * 100;
        double percRuim = (double) ruim / total * 100;

        // Calcular média das notas
        double media = (double) somaNotas / total;

        // Mostrar resultados
        System.out.println("\n RESULTADOS DA PESQUISA ");
        System.out.println("Total de respondentes: " + total);
        System.out.println("\nÓtimo: " + otimo + " (" + String.format("%.1f", percOtimo) + "%)");
        System.out.println("Bom: " + bom + " (" + String.format("%.1f", percBom) + "%)");
        System.out.println("Ruim: " + ruim + " (" + String.format("%.1f", percRuim) + "%)");
        System.out.printf("Média das notas: %.2f%n", media);

        scanner.close();
    }
}
