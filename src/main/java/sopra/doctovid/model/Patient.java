package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends Utilisateur{

	
	private String nom;
	private String prenom;
	private Civilite civilite;
	private Date dtNaissance;
	private List<Rdv> mesRdvs = new ArrayList<Rdv>();
	
	
	
	public Patient() {
		super();
	}
	
	
	public List<Rdv> getMesRdvs() {
		return mesRdvs;
	}


	public void setMesRdvs(List<Rdv> mesRdvs) {
		this.mesRdvs = mesRdvs;
	}

	public void addRdv(Rdv rdv) {
		this.mesRdvs.add(rdv);
	}
	


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public Date getDtNaissance() {
		return dtNaissance;
	}
	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}
	
	
	
}
