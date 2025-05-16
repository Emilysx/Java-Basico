import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        num = scanner.nextInt();


        if (num % 2 == 0 && num % 5 == 0) {
            System.out.printf("FizzBuzz!! %d é multiplo de 2 e de 5", num);
        }
        else if (num % 2 == 0){
            System.out.printf("Fizz! %d é multiplo de 2", num);
        }
        else if (num % 5 ==0) {
            System.out.printf("Buzz! %d é multiplo de 5", num);
        }
        else {
            System.out.print("ERRO!");
        }

        scanner.close();
    }
}
