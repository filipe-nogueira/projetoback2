package br.com.stefanini.projetofinal.ws.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stefanini.projetofinal.ws.model.Caderno;
import br.com.stefanini.projetofinal.ws.repository.CadernoRepository;

@Service
public class CadernoService {
	
	@Autowired

	CadernoRepository cadernoRepository;
	
	public Caderno cadastrar(Caderno caderno) {
		
		return cadernoRepository.save(caderno);
	}
	
	public Collection<Caderno> buscarTodos(){
		return (Collection<Caderno>) cadernoRepository.findAll();
	}
	
	public void excluir(Caderno caderno) {
		cadernoRepository.delete(caderno);
		
	}
	
	public Caderno buscarPorId(Integer id) {
		Caderno caderno = new Caderno();
		return caderno = cadernoRepository.findById(id).get();
	}
	
	public Caderno alterar(Caderno caderno) {
		return cadernoRepository.save(caderno);
	}
	
	public Caderno consultarPorFabricante(String nome) {
		Caderno caderno = new Caderno();
		
		
		return caderno;
	}
	
	
}