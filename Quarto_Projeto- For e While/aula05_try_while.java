import java.util.InputMismatchException;
import java.util.Scanner;

public class aula05_try_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // O progrma só aceita números e esse números devem ser maior ou igual a 20
        // cso forem maior ou forem outros tipos de texto, o programa pede para digitar
        // nomavente. O progrma só encerra, quando atender os critérios acima.

        int numero;
        while (true){
            try {
                System.out.print("Insira um número: ");
                numero = Integer.parseInt(scanner.nextLine());

                if (numero < 20){ // verifico se o numero é menor que 20
                    System.out.println("O número que você digitou é menor que 20");
                    continue;
                }
                break; // Aqui o codigo está correto e é encerrado

            } catch (NumberFormatException e){ //verifica se foi digitado dado invalidos
                System.out.println("Opa... Você digitou caracteres invalidos, digite apenas números!");
            }

        }
        System.out.println(numero);
    }
}
