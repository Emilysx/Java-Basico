public class Colaborador {
    int edv;
    String nome;
    String cargo;


    //Construtor padão existe em toda classe
    // Construtor padrão ou sem parâmetro.
    Colaborador(){
        System.out.println("O construtor sem parâmetros foi executado!");
    }


    Colaborador(String nome){
        this.nome=nome;
        System.out.println("Construtor com parâmetro foi chamado!");
    }

    //construtor com 2 parâmetros
    Colaborador(String nome, int edv){
        this.nome=nome;
        this.edv=edv;
        System.out.println("Construtor com dois parâmetros foi chamado!");
    }

    //construtor com 3 parâmetros
    Colaborador(String nome, int edv, String cargo){
        this.nome=nome;
        this.edv=edv;
        this.cargo=cargo;
        System.out.println("Construtor com três parâmetrs foi chamado!");
    }
}
