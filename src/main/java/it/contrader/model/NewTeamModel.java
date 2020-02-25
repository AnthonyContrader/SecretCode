package it.contrader.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import it.contrader.model.User.Usertype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Barbara
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class NewTeamModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//@Column(unique = true)
	private int idteam;

	@Column(unique = true)
	private int iduser;


	private String usertype;
@ManyToMany
private Set<User> utentiteam;
}
