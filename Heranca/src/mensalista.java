public class mensalista extends colaborador{
    double bancoDeHoras, salarioMensal;

    public mensalista (int edv, String nome, String cargo, double salarioMensal){
        super(edv, nome, cargo);
        this.salarioMensal = salarioMensal;

    }

    double receberSalario(){
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        return "mensalista{" +
                "edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}
