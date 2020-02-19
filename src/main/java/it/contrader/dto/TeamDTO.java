package it.contrader.dto;

public class TeamDTO {

	private int id;

	private String nometeam;

	private String descrizione;

	private String numeroutenti;
	
	public TeamDTO( ) {
		
	}

	public TeamDTO (String nometeam, String descrizione, String numeroutenti) {
	this.nometeam =	nometeam;
	this.descrizione = descrizione;
	this.numeroutenti = numeroutenti;
		
	}
	
	public TeamDTO (int id, String nometeam, String descrizione, String numeroutenti) {
	this.id = id;
	this.nometeam = nometeam;
	this.descrizione = descrizione;
	this.numeroutenti = numeroutenti;
	}
	
	public int getId() {
		return this.id;
	
	}
	
	public void setId( int id) {
		this.id = id;
	}
	
	public String getNometeam() {
		return this.nometeam;
	
	}
	
	public void setNometeam(String nometeam ) {
		this.nometeam = nometeam;
	}
	
	public String getDescrizione () {
		return this.descrizione;
	
	}
	
	public void setDescrizione (String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getNumeroutenti() {
		return this.numeroutenti;
	}
	
	public void setNumeroutenti( String numeroutenti ) {
		this.numeroutenti = numeroutenti;
	}
	
	@Override
	public String toString() {
		return id + "\t" + nometeam + "\t\t" + descrizione + "\t\t" + numeroutenti;
	}
	
	
	
	
}
	

