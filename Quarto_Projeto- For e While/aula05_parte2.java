import java.util.Scanner;

public class aula05_parte2 {
    public static void main(String[] args) {

        // Conversões em Java
        Scanner scanner = new Scanner(System.in);
        String numeroEmTexto = scanner.nextLine();
        // WRAPPER
        // Tipo Primitivos: são básicos, eles salvam apenas valores.
        // Wrappers: Eles são complexos, tem valores e funções
        // Exemplos de Wrappers: Integer, Double, Boolean, Character
        //Obs: Tipo primitivos são todos com letras minusculas, Wrappers ele iniciam com letras maiuscula.

        // ParseInt -- Converte Strins em números inteiros.
        int numeroEmInt = Integer.parseInt(numeroEmTexto);
        // ParseDouble -- Converete String em números do tipo double
        Double numeroEmDouble = Double.parseDouble(numeroEmTexto);

        int numero = 18;
        //ToStrinh -- Converte números em Strings
        String numeroEmString = Integer.toString(numero);


        System.out.println(numeroEmString + 18);


    }
}
