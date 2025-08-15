import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Entrada de dados via teclado - Scanner
        String nome, sobrenome;
        int idade;

        Scanner scanner = new Scanner(System.in); // só declara uma vez

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine(); // nexline utilizamos para ler strings

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();// nexLine vazio para limpar o buffer


        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.printf("O meu nome é %s tenho %d e meu sobrenome é %s", nome, idade, sobrenome);

        scanner.close();
    }
}