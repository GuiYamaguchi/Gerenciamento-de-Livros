package com.atividade.GerenciamentoLivro.controller;

import com.atividade.GerenciamentoLivro.entity.Livro;
import com.atividade.GerenciamentoLivro.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro){
        return livroService.criarLivro(livro);
    }

    @GetMapping
    public List<Livro> listarTodosLivros(){
        return livroService.listarTodosLivros();
    }

    @GetMapping("/{id}")
    public Optional<Livro> buscarLivroId(@PathVariable Long id){
        return livroService.buscarLivroId(id);
    }

    @DeleteMapping
    public void deletarLivro(@PathVariable Long id){
        livroService.deletarLivro(id);
    }
}
