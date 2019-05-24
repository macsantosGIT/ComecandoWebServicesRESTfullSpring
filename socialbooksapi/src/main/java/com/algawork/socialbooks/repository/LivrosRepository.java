package com.algawork.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
