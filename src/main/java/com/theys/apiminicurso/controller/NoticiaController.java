package com.theys.apiminicurso.controller;

import com.theys.apiminicurso.models.Noticia;
import com.theys.apiminicurso.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/itens")
public class NoticiaController {

    final NoticiaService noticiaService;

    @Autowired
    public NoticiaController(NoticiaService noticiaService) {
        this.noticiaService = noticiaService;
    }

    @GetMapping
    public List<Noticia> buscarTodos(){
        return noticiaService.buscarTodos();
    }

    @PostMapping
    public void registrar(@RequestBody Noticia noticia){
        noticiaService.registrar(noticia);
    }
}
