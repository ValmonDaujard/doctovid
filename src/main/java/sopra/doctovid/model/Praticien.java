package sopra.doctovid.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@DiscriminatorValue("Praticien")
public class Praticien extends Utilisateur {

	@JsonView(Views.ViewCommon.class)
	private String nom;
	@JsonView(Views.ViewCommon.class)
	private String prenom;
	@Enumerated(EnumType.STRING)
	@JsonView(Views.ViewCommon.class)
	private Specialite specialite;
	@ManyToMany
	@JoinTable(name = "praticien_lieu_consult", joinColumns = @JoinColumn(name = "praticien_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "lieuConsult_id ", referencedColumnName = "id"))
	@JsonView(Views.ViewCommon.class)
	private List<LieuConsult> mesLieux = new ArrayList<LieuConsult>();
	@OneToMany(mappedBy = "praticien")
	@JsonView(Views.ViewPraticien.class)
	private List<Rdv> mesRdvs = new ArrayList<Rdv>();

	public Praticien() {
		super();
	}

	public Praticien(String nom, String prenom, Specialite specialite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
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

	public List<LieuConsult> getMesLieus() {
		return mesLieux;
	}

	public void setMesLieus(List<LieuConsult> mesLieus) {
		this.mesLieux = mesLieus;
	}

	public void addLieu(LieuConsult lieu) {
		this.mesLieux.add(lieu);
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
