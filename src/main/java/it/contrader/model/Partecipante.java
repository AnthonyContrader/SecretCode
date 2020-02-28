package it.contrader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Partecipante {
	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idp;
	
	private String nickname;
	
	private String teamnumero;
}