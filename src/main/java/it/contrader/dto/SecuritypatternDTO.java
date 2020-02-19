package it.contrader.dto;

public class SecuritypatternDTO {
	private int id;

	private String nome;

	private String tipo;
	
	public SecuritypatternDTO( ) {
		
	}

	public SecuritypatternDTO (String nome, String tipo) {
	this.nome =	nome;
	this.tipo = tipo;
		
	}
	
	public SecuritypatternDTO (int id, String nome, String tipo) {
	this.id = id;
	this.nome = nome;
	this.tipo = tipo;
	}
	
	public int getId() {
		return this.id;
	
	}
	
	public void setId( int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	
	}
	
	public void setNome(String nome ) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return this.tipo;
	
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return id + "\t" + nome + "\t\t" + tipo;
	}
}
