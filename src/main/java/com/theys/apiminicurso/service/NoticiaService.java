package com.theys.apiminicurso.service;

import com.theys.apiminicurso.models.Noticia;
import com.theys.apiminicurso.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    final NoticiaRepository noticiaRepository;

    @Autowired
    public NoticiaService(NoticiaRepository noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }

    public List<Noticia> buscarTodos(){
        return noticiaRepository.findByAtivo(true);
    }

    public void registrar(Noticia noticia) {
        noticiaRepository.save(noticia);
    }
}
