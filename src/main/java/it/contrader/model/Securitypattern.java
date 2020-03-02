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
public class Securitypattern {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ids;
	
	private String nome;
	
	private String tipo;
}
