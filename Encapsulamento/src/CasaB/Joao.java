package CasaB;

import CasaA.Maria;

public class Joao extends Maria {
    void teste(){
        System.out.println(super.segredo); // private - só ve na mesma classe
        System.out.println(super.facoDentroDeCasa);  // package - só ve no mesmo pacote
        System.out.println(super.familiaSabe); // prodected - pode ver em pacotes diferentes desde que existe a relação de heranças
        System.out.println(super.todoMundoSabe); // public - todas as clases podem visualizar
    }

}
