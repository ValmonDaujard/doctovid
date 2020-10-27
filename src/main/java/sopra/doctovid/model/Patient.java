package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@DiscriminatorValue("Patient")
public class Patient extends Utilisateur {

	private String nom;
	private String prenom;
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyy")
	private Date dtNaissance;
	@OneToMany(mappedBy = "patient")
	private List<Rdv> mesRdvs = new ArrayList<Rdv>();

	public Patient() {
		super();
	}

	public Patient(String nom, String prenom, Civilite civilite, Date dtNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.dtNaissance = dtNaissance;
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

	public List<Rdv> getMesRdvs() {
		return mesRdvs;
	}

	public void setMesRdvs(List<Rdv> mesRdvs) {
		this.mesRdvs = mesRdvs;
	}

	public void addRdv(Rdv rdv) {
		this.mesRdvs.add(rdv);
	}

}
