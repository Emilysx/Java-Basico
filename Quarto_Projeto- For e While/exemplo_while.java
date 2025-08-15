import java.util.Scanner;

public class exemplo_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String valor = "";

        /*Toda vez que o usuario digitar algo diferente de sair,
        * o codigo continua, quando o usuario digitar a palavra
        * "sair" o codigo encerra.
        *
         */

        // Stringd só se compara com metodo equals, não utilize ==
        // == só se utiliza para tipo primitivo de dados, int, double, boolean, etc
        while(!valor.equalsIgnoreCase("sair")){
            System.out.print("Insira algo: ");
            valor = scanner.nextLine();

        }
    scanner.close();
    }
}
