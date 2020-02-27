<<<<<<< Updated upstream
package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	
	

}

=======
package it.contrader.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;
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
	private Long id;

	@Column(unique = true)
	private String username;

	private String password;

	private Usertype usertype;
	
	@OneToMany(mappedBy= "user")
	private Set<NewTeamModel> teams;
	

}

>>>>>>> Stashed changes
