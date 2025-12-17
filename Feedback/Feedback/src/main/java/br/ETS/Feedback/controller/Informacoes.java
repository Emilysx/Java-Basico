package br.ETS.Feedback.controller;
import br.ETS.Feedback.Curso;
import br.ETS.Feedback.DadosCadastroInstrutor;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Informacoes {
    private String nome;
    private String email;
    private String edv;
    private Curso curso;

    public Informacoes (DadosCadastroInstrutor dadosCadastroInstrutor){
        this.nome = dadosCadastroInstrutor.nome();
        this.email = dadosCadastroInstrutor.email();
        this.edv = dadosCadastroInstrutor.edv();
        this.curso = dadosCadastroInstrutor.curso();

    }

}
