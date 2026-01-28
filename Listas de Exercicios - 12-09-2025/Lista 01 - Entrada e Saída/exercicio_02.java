import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        int n1, n2, soma, sub, mult, resto;
        double div, pot;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();

        // Cálculos
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        pot = Math.pow(n1, n2);

        // Saída
        System.out.println("\nRESULTADOS:");
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + sub);
        System.out.println("Multiplicação = " + mult);

        if (n2 == 0){
            System.out.println("A divisão não poderá ser realizada.\n");
        }
        else{
            div = (double) n1 / n2;
            System.out.printf("Divisão: %.2f\n", div);

            resto = n1 % n2;
            System.out.printf("Resto: %d\n", resto);
        }

        System.out.println("Potência = " + pot);

        entrada.close();

    }
}
