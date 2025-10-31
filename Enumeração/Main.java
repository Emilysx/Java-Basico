public class Main {
    public static void main(String[] args) {
        Prioridade prioridade = Prioridade.BAIXA;

        switch (prioridade){
            case BAIXA -> System.out.println("Chamado com prioridade baixa, resolver quando tiver disponibilidade");
            case MEDIA -> System.out.println("Chamado com prioridade média, rsolver assim que possível");
            case ALTA -> System.out.println(" Chamado com prioridade alta, resolver o quanto antes");
            case URGENTE -> System.out.println("chamado com prioridade urgente, resilver agora");
        }


    }
}
