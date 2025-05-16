public class exercicio {
    public static void main(String[] args) {
        double media = 7.1;
        int falta = 20;
        boolean postura = true;

        String situacao;
        // Verdadeiro ou falso
        if (media >= 5.0 && falta < 25 && postura == true){
            // caso for verdadeiro ele vai executar as comandos da chaves
            situacao = "Aprovado";
        }
        else if (media < 5.0 && falta < 25 && postura) {
            situacao = "Recuperação";
        }
        else if (media >= 5.0 && falta >= 25 && postura ) {
            situacao ="Sem férias";
        }
        else if (media >= 5.0 && falta <25 && postura == false) {
            situacao = "Chamar para conversar";
        }
        else {
            situacao = "Reprovado";
        }

        System.out.println(situacao);
    }
}