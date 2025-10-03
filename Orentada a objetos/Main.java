public class Main {

    public static void main(String[] args) {

//      Colaborador colaborador = new Colaborador("Emily Gabrielle"); //instanciação
//      System.out.println(colaborador.nome);

//      // 2 parâmetros
//      Colaborador colaborador = new Colaborador("Emily Gabrielle", 92906633); //instanciação
//      System.out.println(colaborador.nome);
//        System.out.println(colaborador.edv);


//        // 3 parâmetros
//        Colaborador colaborador = new Colaborador("Emily Gabrielle", 92906633, "Jovem Aprendiz"); //instanciação
//        System.out.println(colaborador.nome);
//        System.out.println(colaborador.edv);
//        System.out.println(colaborador.cargo);


        Departamento departamento = new Departamento("ETS", 10000000, 20000);
//        System.out.println(departamento.nome);
//        departamento.atualizarNome("ETC");
//        System.out.println(departamento.nome);
//        departamento.exibirDetalhes();
        System.out.println("O orçamento foi de: "+departamento.calcularAumentoDeOrcamento(0.30));

//        System.out.printf("O departamento %s tem");

    }
}
