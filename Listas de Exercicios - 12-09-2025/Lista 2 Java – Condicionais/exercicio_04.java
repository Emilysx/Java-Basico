import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        int destino, refeicao;
        double valorBase = 3000.00;
        double valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE VIAGEM ===");
        System.out.println("Destinos disponíveis:");
        System.out.println("1 - Maceió");
        System.out.println("2 - Porto de Galinhas");
        System.out.print("Escolha o destino (1 ou 2): ");
        destino = scanner.nextInt();

        System.out.println("\nRefeição incluso?");
        System.out.println("1 - Sim (com almoço/janta)");
        System.out.println("2 - Não (sem almoço/janta)");
        System.out.print("Escolha a opção (1 ou 2): ");
        refeicao = scanner.nextInt();

        // Cálculo baseado nas escolhas
        if (destino == 1) { // Maceió
            if (refeicao == 1) { // Com refeição
                valorFinal = valorBase + (valorBase * 1.00); // +100%
            }
            else { // Sem refeição
                valorFinal = valorBase + (valorBase * 0.85); // +85%
            }
        }
        else { // Porto de Galinhas
            if (refeicao == 1) { // Com refeição
                valorFinal = valorBase + (valorBase * 0.60); // +60%
            }
            else { // Sem refeição
                valorFinal = valorBase + (valorBase * 0.45); // +45%
            }
        }

        // Saída
        System.out.printf("\nValor base: R$ %.2f%n", valorBase);

        String destinoNome = (destino == 1) ? "Maceió" : "Porto de Galinhas";
        String refeicaoTexto = (refeicao == 1) ? "Com almoço/janta" : "Sem almoço/janta";

        System.out.println("Destino escolhido: " + destinoNome);
        System.out.println("Refeição: " + refeicaoTexto);
        System.out.printf("VALOR FINAL: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}