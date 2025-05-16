public class exemplo_SwitchCase {
    public static void main(String[] args) {
        /*
        int opcao = 9;
        // Estrutura antiga
        switch (opcao){
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Caso Padrão");
        }
         */

        int opcao =2;
        switch (opcao){
            case 1 -> System.out.println("Caso 1");
            case 2 -> System.out.println("Caso 2");
            case 3 -> System.out.println("Caso 3");
            default -> System.out.println("Caso Padrão");
        }
    }
}
