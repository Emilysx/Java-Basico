import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("A temperatura convertida para Fahrenheit é: %.2f", fahrenheit);
        scanner.close();
    }
}
