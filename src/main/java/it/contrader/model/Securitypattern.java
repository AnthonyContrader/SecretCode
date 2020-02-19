package it.contrader.model;

public class Securitypattern {
	private int id;
	
	private String nome;
	
	private String tipo;


	
	
	public Securitypattern() {
		
	}
	
	public Securitypattern (String nome, String tipo) {
		this.nome		= nome;
		this.tipo		= tipo;
		
	}
	
	public Securitypattern (int id, String nome, String tipo) {
		this.id= id;
		this.nome		= nome;
		this.tipo		= tipo;
		
	}
	
public int getId() {
	return this.id;
}
public void setId(int id) {
    this.id = id;
}

public String getNome() {
	return this.nome;
} 
public void setNome(String nome) {
	this.nome = nome;
}

public String getTipo() {
	return this.tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo; 
}

@Override
public String toString() {
	return id + "\t" + nome +"\t\t" + tipo;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (this.getClass() != obj.getClass())
		return false;
	Securitypattern other = (Securitypattern) obj;
	if (id != other.id)
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (tipo == null) {
		if (other.tipo != null)
			return false;
	} 
	return true;
}
}
