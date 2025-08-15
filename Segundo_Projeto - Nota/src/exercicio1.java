import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        /*
        double tempo = 90;

        // Bloco de codigos separados - Bloco A
        if (tempo >= 90){
            System.out.println("O tempo foi menor que 90");
        }

        // Bloco de codigos separados - Bloco A
        if (tempo > 60){
            System.out.println("O tempo foi menor que 60");
        }
        */

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.printf("Esse número %d é par", num);
        }
        else{
            System.out.printf("Esse número %d é impar", num);
        }
        scanner.close();
    }
}
