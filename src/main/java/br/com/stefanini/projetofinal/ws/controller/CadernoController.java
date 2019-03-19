package br.com.stefanini.projetofinal.ws.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetofinal.ws.model.Caderno;
import br.com.stefanini.projetofinal.ws.model.Linhas;
import br.com.stefanini.projetofinal.ws.service.CadernoService;
import br.com.stefanini.projetofinal.ws.service.LinhaService;


@RestController
@CrossOrigin
public class CadernoController {
	
	@Autowired
	CadernoService cadernoService;
	
	@Autowired
	LinhaService linhaService;
	
	//comunicação WEB
	@RequestMapping(method=RequestMethod.POST, value="/cadastrarLinha", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Linhas> cadastrarLinha(@RequestBody Linhas linha) {
		
		System.out.println("Entrou no metodo post");
		Linhas linhaSalvo = linhaService.cadastrar(linha);
		
		return new ResponseEntity<Linhas>(linhaSalvo, HttpStatus.OK);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cadastrarCadernos", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Caderno> cadastrarCaderno(@RequestBody Caderno caderno) {
		
		System.out.println("Entrou no metodo post");
		Caderno cadernoSalvo = cadernoService.cadastrar(caderno);
		
		System.out.println("ID caderno: " + cadernoSalvo.getId());
		
		return new ResponseEntity<Caderno>(cadernoSalvo, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="listaCadernos", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Caderno>> buscarTodosCadernos(){
		Collection<Caderno> todosCadernos = cadernoService.buscarTodos();
		
		return new ResponseEntity<Collection<Caderno>>(todosCadernos, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="listaCadernos/{id}")
	public ResponseEntity<Caderno> excluirCaderno(@PathVariable Integer id){
		
		
		Caderno cadernoEncontrado = cadernoService.buscarPorId(id);
		if(cadernoEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		cadernoService.excluir(cadernoEncontrado);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="listaCadernos", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Caderno> alterarCaderno(@RequestBody Caderno caderno){
		Caderno cadernoAlterado = cadernoService.alterar(caderno);
		
		return new ResponseEntity<>(cadernoAlterado, HttpStatus.OK);
	}
}
