package br.com.stefanini.projetofinal.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stefanini.projetofinal.ws.model.Linhas;
import br.com.stefanini.projetofinal.ws.repository.LinhaRepository;

@Service
public class LinhaService {
	
	@Autowired
	LinhaRepository linhaRepository;
	
	public Linhas cadastrar(Linhas linha) {
		
		return linhaRepository.save(linha);
	}

}
