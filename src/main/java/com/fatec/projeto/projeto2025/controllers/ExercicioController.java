package com.fatec.projeto.projeto2025.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ExercicioController {

    @GetMapping("")
    public String HelloWorld1() {
        return "hello";
    }

    @GetMapping("{nome}")
    public String HelloWorld(@PathVariable Optional<String> nome) {
        return nome.isPresent() ? nome.get() : "dd";
    }
    
}
