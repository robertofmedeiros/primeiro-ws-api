package br.com.senac.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorld {

    @GetMapping("/teste")
    public ResponseEntity<String> testeQueryString(@RequestParam String nome){
        if(nome.equalsIgnoreCase("roberto")){
            return ResponseEntity.ok("acertou");
        }

        return ResponseEntity.badRequest().body("Errou");
    }

    @GetMapping("/teste/{nome}")
    public ResponseEntity<String> testePathParam(@PathVariable String nome){
        if(nome.equalsIgnoreCase("roberto")){
            return ResponseEntity.ok("acertou");
        }

        return ResponseEntity.badRequest().body("Errou");
    }
}
