package com.algawork.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long>{

}
