public class exemploaula {
    public static void main(String[] args) {

        /*
        int i; // declarada fora
        for (i = 0; i <= 10; i++) {
            if (i == 5) {
                break; // Quebra o laço de repetição
            }
        }

        System.out.println(i);
    }  */
        int i;
        for (i = 0; i <= 10; i++){

            if (i % 2 == 0) {
               continue; // reinicia o laço de repetição
            }
            System.out.println(i);
        }
    }
}
