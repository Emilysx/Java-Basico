public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;

    public Departamento(String nome, double orcamento, int numeroFuncionarios){
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    void atualizarNome(String nome){
        // void são metódos que nõ possuem retorno
        this.nome = nome;

    }

    void exibirDetalhes(){ //Nome de metodo segue o padrao camelcase
        System.out.printf("O departamento de %s está com %d de funcionarios e o orçamento de %.2f\n",this.nome, this.numeroFuncionarios, this.orcamento);

    }

    double calcularAumentoDeOrcamento(double percentutal){
        return (orcamento*percentutal)+orcamento;

    }

    double obterNumerosDeFuncionarios(){
        return numeroFuncionarios;
    }
}