package com.algawork.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long>{

}
