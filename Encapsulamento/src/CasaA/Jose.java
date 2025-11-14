package CasaA;

public class Jose {
    Maria esposa = new Maria();

    void teste(){
        System.out.println(esposa.segredo); //priveite
        System.out.println(esposa.facoDentroDeCasa); // package
        System.out.println(esposa.familiaSabe);  // prodected
        System.out.println(esposa.todoMundoSabe); // public

    }
}
