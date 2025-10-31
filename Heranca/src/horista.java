public class horista extends colaborador{
    double horasTrabalhadas;
    double salarioPorHora;

    public horista(int edv, String nome, String cargo, double horasTrabalhadas, double salarioPorHora){
        super(edv, nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    double receberSalario(){
        return this.salarioPorHora * this.horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "horista{" +
                "salarioPorHora=" + salarioPorHora +
                ", edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", horasTrabalhadas=" + horasTrabalhadas +
                '}';
    }
}
