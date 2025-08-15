import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        double base, altura, area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base de um triângulo: ");
        base = scanner.nextDouble();

        System.out.print("Informe a altura de um triângulo: ");
        altura = scanner.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("A área desse triângulo é de: %.2f", area);
        scanner.close();
    }
}
