package it.contrader.model;

public class Team {

	
	
	private int id;
	
	private String nometeam;
	
	private String descrizione;

	private int numeroutenti;
	
	
	public Team() {
		
	}
	
	public Team (String nometeam, String descrizione, int numeroutenti) {
		this.nometeam= nometeam;
		this.descrizione= descrizione;
		this.numeroutenti= numeroutenti;
		
	}
	
	public Team (int id,String nometeam, String descrizione, int numeroutenti) {
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

public void setNumeroutenti(int numeroutenti) {
	this.numeroutenti = numeroutenti;
}

public int getNumeroutenti() {
	return this.numeroutenti;
}

public String toString() {
	return id + "\t" + nometeam +"\t\t" + descrizione + "\t\t" + numeroutenti;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
	result = prime * result + id;
	result = prime * result + ((nometeam == null) ? 0 : nometeam.hashCode());
	result = prime * result + numeroutenti;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Team other = (Team) obj;
	if (descrizione == null) {
		if (other.descrizione != null)
			return false;
	} else if (!descrizione.equals(other.descrizione))
		return false;
	if (id != other.id)
		return false;
	if (nometeam == null) {
		if (other.nometeam != null)
			return false;
	} else if (!nometeam.equals(other.nometeam))
		return false;
	if (numeroutenti != other.numeroutenti)
		return false;
	return true;
}


}
	
	
	
	
	
	
	
	
	
	
	
	
	

