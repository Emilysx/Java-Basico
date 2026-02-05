import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        String resp;

        System.out.println("Escolha (1 ou 2): ");
        opcao = entrada.nextInt();
        entrada.nextLine(); // limpa o buffer

        if (opcao == 1) {
            System.out.println("\nPergunta: 2+2=?");
            System.out.println("a) 3");
            System.out.println("b) 4");
            System.out.println("c) 5");
            System.out.print("Resposta: ");
            resp = entrada.nextLine();

            resp = resp.toLowerCase();

            if (resp.equals("b")) {
                System.out.println("Acertou! Pode retirar seu bônus na Shostners and Shostners!.");
            } else {
                System.out.println("Errou! Tente outra vez.");
            }
        }
        else if (opcao == 2) {
            System.out.println("\nPergunta: Cor do céu?");
            System.out.println("a) Verde");
            System.out.println("b) Azul");
            System.out.println("c) Vermelho");
            System.out.print("Resposta: ");
            resp = entrada.nextLine();

            resp = resp.toLowerCase();

            if (resp.equals("b")) {
                System.out.println("Acertou!Pode retirar seu bônus na Shostners and Shostners!.");
            } else {
                System.out.println("Errou! Tente outra vez.");
            }
        }

        entrada.close();
    }
}