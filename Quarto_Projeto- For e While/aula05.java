import java.util.Scanner;

public class aula05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{ //Primeiro tenta executar um bloco de código
            int numero = scanner.nextInt();
            System.out.println(numero);
        }catch (Exception erro){
            // caso ele não consiga, o catch identifica
            // o erro e laça uma tratativa
            System.out.println("Digite apenas números!");
        }
    }
}
