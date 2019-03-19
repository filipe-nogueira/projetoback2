package br.com.stefanini.projetofinal.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Linhas {
	
	@Id
	@GeneratedValue
	private int id;
	private String conteudo;
	private int idCaderno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public int getIdCaderno() {
		return idCaderno;
	}
	public void setIdCaderno(int idCaderno) {
		this.idCaderno = idCaderno;
	}
	
	
}
