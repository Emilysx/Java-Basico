public class Circulo {
    /*
    * Cor e Raio, sao variaveis dinâmicas, elas mudam
    * de acordo com o objeto instanciado
    */

    String cor;
    double raio;

    /*
    pi é uma variavel estatica, ela pertence a classe, ou seja
    a cada vez que uma instancia se referir ao pi, ele sempre usará
    o mesmo espaço de memoria qie foi alocado.
     */
    static final double PI = Math.PI;

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea(){
        return PI * this.raio * this.raio;
    }

}
