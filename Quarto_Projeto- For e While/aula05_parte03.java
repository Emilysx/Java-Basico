import java.util.InputMismatchException;
import java.util.Scanner;

public class aula05_parte03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String numeroEmTexto = scanner.nextLine();

        try {
            int numeroEmInt = Integer.parseInt(numeroEmTexto);
            System.out.println("O número que vc digitou foi " +numeroEmInt);

        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Formato incorreto, digite apenas números!");

           // Finally é opcional
        } finally {
        System.out.println("Finally é sempre executado18");
        }
    }
}
