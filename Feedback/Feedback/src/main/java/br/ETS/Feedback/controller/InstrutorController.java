package br.ETS.Feedback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

    @PostMapping // define que esse metodo é do tipo POST
    public void cadastrar(@RequestBody DadosCadastroIntrutor dadosCadastroIntrutor){ //essa anotação serve para mostrar que o metodo tem corpo na requisição
        System.out.println(dadosCadastroIntrutor);
    }
}
