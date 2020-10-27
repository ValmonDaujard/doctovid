package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.List;

public class Praticien extends Utilisateur{

	private String nom;
	private String prenom;
	private Specialite specialite;
	private List<LieuConsult> mesLieux  = new ArrayList<LieuConsult>();
	private List<Rdv> mesRdvs  = new ArrayList<Rdv>();
	
	
	
	
	public List<LieuConsult> getMesLieus() {
		return mesLieux;
	}
	public void setMesLieus(List<LieuConsult> mesLieus) {
		this.mesLieux = mesLieus;
	}
	public List<Rdv> getMesRdvs() {
		return mesRdvs;
	}
	public void setMesRdvs(List<Rdv> mesRdvs) {
		this.mesRdvs = mesRdvs;
	}
	
	public Praticien() {
		super();
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
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	
	
}
