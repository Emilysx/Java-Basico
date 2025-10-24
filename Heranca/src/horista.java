public class horista extends colaborador{
    double horasTrabalhadas;
    double salarioPorHora;

    public horista(int edv, String nome, String cargo, double horasTrabalhadas, double salarioPorHora){
        super(edv, nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }
}
