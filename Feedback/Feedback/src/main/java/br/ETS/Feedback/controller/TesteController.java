package br.ETS.Feedback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa anotação serve para mostrar que é um Controller de um api rest
@RequestMapping("/teste") // essa anotação serve para mapear o endpoint das requisições


public class TesteController {

    @GetMapping //Essa anotação define que o metodo vai ser do tipo GET
    public String hello(){
        return "Spring Boot Test-Emily";
    }
}
