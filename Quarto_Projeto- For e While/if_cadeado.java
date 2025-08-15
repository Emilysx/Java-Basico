public class if_cadeado {
    public static void main(String[] args) {

        externo: // Para dar nomes para os laços de repetição
        for (int i = 0; i < 3; i++){
            System.out.println("Banana");
            for (int j = 0; j < 2; j++) {
                System.out.println("Maça");
                break externo;
            }
        }
    }
}
