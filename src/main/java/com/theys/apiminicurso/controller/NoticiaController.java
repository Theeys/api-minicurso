package com.theys.apiminicurso.controller;

import com.theys.apiminicurso.models.Noticia;
import com.theys.apiminicurso.service.NoticiaService;
import com.theys.apiminicurso.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("api/itens")
public class NoticiaController {

    private final SecurityService securityService;
    private final NoticiaService noticiaService;

    @Autowired
    public NoticiaController(SecurityService securityService, NoticiaService noticiaService) {
        this.securityService = securityService;
        this.noticiaService = noticiaService;
    }

    @GetMapping
    public List<Noticia> buscarTodos(){
        return noticiaService.buscarTodos();
    }

    @PostMapping
    public void registrar(@RequestBody Noticia noticia, @RequestHeader("key") String key) {
        securityService.validar(key);
        noticiaService.registrar(noticia);
    }

    @PostMapping("all")
    public void registrar(@RequestBody List<Noticia> noticias, @RequestHeader("key") String key) {
        securityService.validar(key);
        noticiaService.registrar(noticias);
    }

    @DeleteMapping
    public void deletarTodos(@RequestHeader("id") Integer id,@RequestHeader("key") String key){
        securityService.validar(key);
        noticiaService.deletar(id);
    }

    @DeleteMapping("all")
    public void deletarTodos(@RequestHeader("key") String key){
        securityService.validar(key);
        noticiaService.deletarTodos();
    }
}
