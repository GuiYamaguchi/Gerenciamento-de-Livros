package com.atividade.GerenciamentoLivro.service;

import com.atividade.GerenciamentoLivro.entity.Livro;
import com.atividade.GerenciamentoLivro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro criarLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public List<Livro> listarTodosLivros(){
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarLivroId(Long id){
        return livroRepository.findById(id);
    }

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }
}