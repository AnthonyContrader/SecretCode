package it.contrader.model;
public class NewTeamModel {
	
	private int idteam;

	private String usertype;
	private int iduser;

	
	public NewTeamModel() {
		
	}

	public NewTeamModel (int iduser, String usertype,int idteam) {
		this.iduser = iduser;
		this.usertype = usertype;
		this.idteam= idteam;
	}

	public int getIdteam() {
		return this.idteam;
	}
	public void setId(int idteam) {
		this.idteam = idteam;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public int getIduser() {
		return this.iduser;
	}

	@Override
	public String toString() {
		return  iduser + "\t"  + usertype +"\t\t" +  idteam;
	}
}
