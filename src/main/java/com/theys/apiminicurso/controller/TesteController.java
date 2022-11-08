package com.theys.apiminicurso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("teste")
public class TesteController {

    @GetMapping
    public String teste(){
        return "Ok!";
    }

}
