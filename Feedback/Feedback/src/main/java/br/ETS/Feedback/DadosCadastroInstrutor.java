package br.ETS.Feedback;

public record DadosCadastroInstrutor(String nome,
                                     String email,
                                     String edv,
                                     Curso curso,
                                     DadosInformacoes informacoes) {

}
