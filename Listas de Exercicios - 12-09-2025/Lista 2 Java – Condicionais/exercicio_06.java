import java.util.Scanner;
import java.util.Random;

public class exercicio_06 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int sorteado = rand.nextInt(100) + 1;
        int chute;

        System.out.println("Você tem 3 tentativas");

        // Primeira tentativa
        System.out.print("\n1ª tentativa: ");
        chute = entrada.nextInt();
        if (chute == sorteado) {
            System.out.println("Acertou!");
            entrada.close();
            return;
        }

        // Segunda tentativa
        System.out.print("2ª tentativa: ");
        chute = entrada.nextInt();
        if (chute == sorteado) {
            System.out.println("Acertou!");
            entrada.close();
            return;
        }

        // Terceira tentativa
        System.out.print("3ª tentativa: ");
        chute = entrada.nextInt();
        if (chute == sorteado) {
            System.out.println("Acertou!");
        }
        else {
            System.out.println("Errou! Número era: " + sorteado);
        }

        entrada.close();
    }
}