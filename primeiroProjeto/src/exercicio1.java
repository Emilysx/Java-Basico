import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = ( fahrenheit - 32) * 5/9;
        System.out.printf("A temperatura convertida para Celsius é: %.2f", celsius);
        scanner.close();
    }
}
