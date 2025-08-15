import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        double peso, altura, imc;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        peso = scanner.nextDouble();

        System.out.print("Informe a sua altura: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("O seu IMC é de: %.2f", imc);

        scanner.close();
    }
}
