package juste.spring.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Bem vindo a minha Web API Spring Boot!";
    }

    @GetMapping("/users")
    public String users(){
        return "Usuário autorizado!";
    }

    @GetMapping("/managers")
    public String managers(){
        return "Gerente autorizado!";
    }

}
