import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String minhaString = "Like a Boach"; // Um sinal de igual = Atribuição
        // OPERADOR RELACIONAL - Sempre retornam valores booleanos - true ou false
        System.out.println(10==5+5); // Dois sinais de igual == Igualdade
        System.out.println('A' == 'a');
        System.out.println(minhaString == "Like a Boach");

         */

        /*

        String minhaString;
        Scanner scanner = new Scanner(System.in);
        minhaString = scanner.nextLine();
        System.out.println(minhaString.equals("Like a Bosch")); // Comparação de objetos eu sempre utilizo o equals
        */

        // Operadores Relacionais - Interprete como perguntas
        /*
        // == Igualdade
        System.out.println(10==5+5);

        // != Diferente de
        System.out.println('A' != 'a');

        // > Maior que
        System.out.println(20>15);

        // < Menor que
        System.out.println(10<10);

        // >= Maior ou igual
        System.out.println(15>=15);

        // <= Menor ou igual
        System.out.println(10<=10);


        //Operadores Logicos
        //binarios(tem duas entradas)

        //AND  - &&

        // OR  - ||

        // unitario(apenas uma entrada)
        //NOT  - !


        boolean condicao1 = true;
        boolean condicao2 = 15<12;

        System.out.println(condicao1);
        System.out.println(condicao2);
        System.out.println(condicao1 && condicao2); //AND
        System.out.println(condicao1 || condicao2); //OR
        System.out.println(!condicao1); //NOT
        System.out.println(condicao1 ^ condicao2); //XOR



        int x = 5;
        int y = 6;
        System.out.printf("x= %d y= %d\n", x, y);

        //Incremento - 01:
        x = x + 1;
        y = y + 1;
        System.out.printf("x= %d y= %d\n", x, y);

        //Incremento - 02:
        x++;
        y++;
        System.out.printf("x= %d y= %d\n", x, y);

        //Incremento - 03:
        x +=1;
        y +=1;
        System.out.printf("x= %d y= %d\n", x, y);



        //OPERADOR TERNARIO
        String resultado;
        double media = 4.9;

        resultado = media >= 5 ? "Aprovado" : "Reprovado";
        //           Espressão  ? valor se verdadeiro : valor se falso
        System.out.println(resultado);

         */

        double media =7.1;
        int faltas = 20;
        boolean postura = true;
        String situacao;


        /*
        *Para ser aprovado ele precisa que as 3 sejam verdadeiras
        * media>=5
        * faltas <25
        * postura = true
        *
        * se falhar na média = recuperação
        *
        * se falhar nas faltas = sem férias
        *
        * se falhar na postura = chamar para conversar
        *
        *
        * Se ele falhar em dois ou mais ele é reprovado diratamente
        */

    }
}