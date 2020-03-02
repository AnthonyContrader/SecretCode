package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="idc")

public class ProjectDTO {
	
	private Long idc;
	
	private String nome;
	
	private String descrizione;
	
}