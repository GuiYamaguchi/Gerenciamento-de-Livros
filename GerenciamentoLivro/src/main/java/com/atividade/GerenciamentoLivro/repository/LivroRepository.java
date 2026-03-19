package com.atividade.GerenciamentoLivro.repository;

import com.atividade.GerenciamentoLivro.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}