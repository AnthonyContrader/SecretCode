package it.contrader.model;

public class Team {

	
	
	private int id;
	
	private String nometeam;
	
	private String descrizione;

	private String numeroutenti;
	
	
	public Team() {
		
	}
	
	public Team (String nometeam, String descrizione, String numeroutenti) {
		this.nometeam= nometeam;
		this.descrizione= descrizione;
		this.numeroutenti= numeroutenti;
		
	}
	
	public Team (int id,String nometeam, String descrizione, String numeroutenti) {
		this.id= id;
		this.nometeam= nometeam;
		this.descrizione= descrizione;
		this.numeroutenti= numeroutenti;
		
	}
	
public int getId() {
	return this.id;
}
public void setId(int id) {
    this.id = id;
}

public String getNometeam() {
	return this.nometeam;
} 
public void setNometeam(String nometeam) {
	this.nometeam = nometeam;
}

public String getDescrizione() {
	return this.descrizione;
}
public void setDescrizione(String descrizione) {
	this.descrizione = descrizione; 
}

public void setNumeroutenti(String numeroutenti) {
	this.numeroutenti = numeroutenti;
}

public String getNumeroutenti() {
	return this.numeroutenti;
}

public String toString() {
	return id + "\t" + nometeam +"\t\t" + descrizione + "\t\t" + numeroutenti;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Team other = (Team) obj;
	if (id != other.id)
		return false;
	if (nometeam == null) {
		if (other.nometeam != null)
			return false;
	}else if (!nometeam.equals(other.nometeam))
		return false;
	
	if (descrizione == null) {
		if (other.descrizione != null)
			return false;
	}else if(!descrizione.equals(other.descrizione))
		return false;
	if (numeroutenti == null ) {
		if(other.numeroutenti != null)
			return false;
	}else if(!numeroutenti.equals(other.numeroutenti))
		return false;
		return true;
		
		}

























}
	
	
	
	
	
	
	
	
	
	
	
	
	

