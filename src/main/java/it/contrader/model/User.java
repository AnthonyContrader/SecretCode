package it.contrader.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

	public enum Usertype {
		ADMIN, USER
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idu;

	@Column(unique = true)
	private String username;

	private String password;

	private Usertype usertype;
	
	
	//relazione Barbara
	@ManyToMany
	@JoinTable(name ="utentiteam",
	joinColumns = @JoinColumn(name ="iduser",
	referencedColumnName ="idu"),
	inverseJoinColumns = @JoinColumn(name ="idteam",
	referencedColumnName ="idt"))
	private Collection<Team> team;

}

