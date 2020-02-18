package it.contrader.model;
//Salvo Furnari
public class Project {
	//Porps
	private int    id;
	private String name;
	private String url;
	private String description;
	//Constructors
	public Project() { }
	public Project(int id, String name, String url, String description) {
		this.id 		 = id;
		this.name 		 = name;
		this.url 		 = url;
		this.description = description;
	}
	public Project(String name, String url, String description) {
		this.name 		 = name;
		this.url 		 = url;
		this.description = description;
	}
	//Getters
	public int 	  getId			( ) { return this.id; 			}
	public String getName		( ) { return this.name; 		}
	public String getUrl		( ) { return this.url; 			}
	public String getDescription( ) { return this.description; 	}
	//Setters
	public void setId		  ( int id            ) { this.id = id; 				  }
	public void setName		  ( String name       )	{ this.name = name; 			  }
	public void setUrl		  ( String url		  ) { this.url = url;				  }
	public void setDescription( String description) { this.description = description; }
}
