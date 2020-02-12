package it.contrader.dto;
//Salvo Furnari
public class ProjectDTO {
	//Porps
	private int    id;
	private String name;
	private String url;
	private String description;
	//Constructors
	public ProjectDTO() { }
	public ProjectDTO(int id, String name, String url, String description) {
		this.id 		 = id;
		this.name 		 = name;
		this.url 		 = url;
		this.description = description;
	}
	public ProjectDTO(String name, String url, String description) {
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
	//Overrides
	@Override
	public String toString() {
		return  this.id + "\t"  + this.name +"\t\t" + this.url + "\t\t" + this.description;
	}
}