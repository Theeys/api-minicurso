package com.theys.apiminicurso.repository;

import com.theys.apiminicurso.models.Noticia;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiaRepository extends PagingAndSortingRepository<Noticia, Integer> {
    List<Noticia> findByAtivo(boolean ativo);
}
