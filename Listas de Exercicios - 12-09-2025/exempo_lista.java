import java.util.ArrayList;

public class exempo_lista {
    public static void main(String[] args) {

        // Exemplo de vetor em Java
        int[] vetor = new int[10];
        vetor[0] = 10;
        System.out.println(vetor[0]);

        // Exemplo de Lista de String
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Emily");
        lista.add("Ana");
        System.out.println(lista);

        // mostra apenas o index escolhido
        System.out.println(lista.get(0));

        // remover um item da lista
        lista.remove(0);
        System.out.println(lista);

        // exemplo de lista de números
        ArrayList<Integer> listanum = new ArrayList<>();



    }
}
