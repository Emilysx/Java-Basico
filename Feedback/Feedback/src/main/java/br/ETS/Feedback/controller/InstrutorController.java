package br.ETS.Feedback.controller;

import br.ETS.Feedback.DadosCadastroInstrutor;
import br.ETS.Feedback.Instrutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

    @PostMapping // define que esse metodo é do tipo POST
    public void cadastrar(@RequestBody DadosCadastroInstrutor dadosCadastroInstrutor){ //Essa anotation serve para mostrar que o metodo tem corpo na requisição
        Instrutor instrutor = new Instrutor(dadosCadastroInstrutor);
        System.out.println(instrutor.getNome());

    }
}

