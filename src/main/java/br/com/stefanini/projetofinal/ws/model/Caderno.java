package br.com.stefanini.projetofinal.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Caderno {
	
	@Id
	@GeneratedValue
	private int id;
	private String fabricante;
	private int qtdFolhas;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getQtdFolhas() {
		return qtdFolhas;
	}
	public void setQtdFolhas(int qtdFolhas) {
		this.qtdFolhas = qtdFolhas;
	}
}
