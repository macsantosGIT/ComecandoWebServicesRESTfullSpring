package com.algawork.socialbooks.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algawork.socialbooks.domain.Comentario;
import com.algawork.socialbooks.domain.Livro;
import com.algawork.socialbooks.repository.ComentariosRepository;
import com.algawork.socialbooks.repository.LivrosRepository;
import com.algawork.socialbooks.services.exceptions.LivroNaoEncontradoException;

@Service
public class LivrosService {

	@Autowired
	private LivrosRepository livrosRepository;
	
	@Autowired
	private ComentariosRepository comentariosRepository;
	
	//private Long id;

	public List<Livro> listar(){
		return livrosRepository.findAll();
	}
	
	public Optional<Livro> buscar(Long id){
		Optional<Livro> livro = livrosRepository.findById(id);
		
		if(!livro.isPresent()) {
			throw new LivroNaoEncontradoException("Livro nao encontrado!");
		}
		return livro;
	}

	public Livro salvar(Livro livro) {
		//id = (Long) null;
		//livro.setId(id);
		return livrosRepository.save(livro);
	}
	
	public void deletar(Long id) {
		try {
			livrosRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("Livro nao encontrado!");
		}
	}
	
	public void atualizar(Livro livro) {
		verificarExistencia(livro);
		livrosRepository.save(livro);
	}
	
	public void verificarExistencia(Livro livro) {
		buscar(livro.getId());
	}
	
	public Comentario salvarComentario(Long livroId, Comentario comentario) {
		Livro livro = buscar(livroId).get();
		
		comentario.setLivro(livro);
		comentario.setData(new Date());
		
		return comentariosRepository.save(comentario);
	}
	
	public List<Comentario> listarComentarios(Long livroId){
		Livro livro = buscar(livroId).get();
		
		return livro.getComentarios();		
	}
}


