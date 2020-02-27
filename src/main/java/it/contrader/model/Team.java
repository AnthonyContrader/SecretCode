<<<<<<< Updated upstream
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
public class Team {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idt;
	
	private String nometeam;
	
	private String descrizione;
	
	private String numeroutenti;

=======
package it.contrader.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Team {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idt;
	
	@Column(unique = true)
	
	private String nometeam;
	
	private String descrizione;
	
	private String numeroutenti;

	@OneToMany(mappedBy= "team")
	private Set<NewTeamModel> users;


>>>>>>> Stashed changes
}