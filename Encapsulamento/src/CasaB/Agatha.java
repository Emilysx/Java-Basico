package CasaB;

import CasaA.Maria;

public class Agatha {
    Maria sogra = new Maria();

    void teste(){
        System.out.println(sogra.segredo); // private - só ve na mesma classe
        System.out.println(sogra.facoDentroDeCasa);  // package - só ve no mesmo pacote
        System.out.println(sogra.familiaSabe); // prodected- pode ver em pacotes diferentes desde que existe a relação de heranças
        System.out.println(sogra.todoMundoSabe); // public - todas as clases podem visualizar
    }

}
