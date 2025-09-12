import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        String nome, sobrenome, data_nasc, formacao, cargo, cnh;
        double pretensao_salararial;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Esse programa vai solicitar dados de cadastro!");

        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Insira seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.print("Insira a data de nascimento ex: (DD/MM/AAAA): ");
        data_nasc = scanner.nextLine();

        System.out.print("Insira a prentensão salarial que vc estima: ");
        pretensao_salararial = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Informe o grau de instrução: ");
        formacao = scanner.nextLine();

        System.out.print("Informe o cargo pretendido: ");
        cargo = scanner.nextLine();


        do {
            System.out.print("Informe se você possui CNH do tipo B (sim/nao): ");
            cnh = scanner.nextLine().toLowerCase();
        } while (!cnh.equals("sim") && !cnh.equals("nao"));

        System.out.println("Dados Pessoais ----------------------------");
        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Sobremone: %s\n", sobrenome);
        System.out.printf("Data de nascimento: %s\n", data_nasc);
        System.out.printf("Pretensão salarial: %.2f\n", pretensao_salararial);
        System.out.printf("Grau de Instrução: %s\n", formacao);
        System.out.printf("CNH tipo B: %s\n", cnh);

        System.out.println("Cadastro concluido com sucesso!");

        scanner.close();














    }
}
