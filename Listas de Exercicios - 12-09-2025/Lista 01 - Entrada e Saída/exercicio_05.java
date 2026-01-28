import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        int horas, min, seg, horaSegundos;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de horas: ");
        horas = scanner.nextInt();

        System.out.print("Insira a quantidade de minutos: ");
        min = scanner.nextInt();

        System.out.print("Insire a quantidade de segundos: ");
        seg = scanner.nextInt();

        // Cálculo
        horaSegundos = (horas * 3600) + (min * 60) + seg;

        // Saída
        System.out.printf("\nHorário informado: %02d:%02d:%02d%n", horas, min, seg);
        System.out.printf("O horário em segundos é: %d segundos.%n", horaSegundos);

        scanner.close();
    }
}
